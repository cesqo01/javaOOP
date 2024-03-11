package hm5.service;

import hm5.model.*;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList;

    public DataService() {
        this.userList = new ArrayList<>();
    }

    public void create(String firstName, String secondName, String lastName, String dateB, Type type) {
        int id = getFreeId(type);
        if (type == Type.STUDENT) {
            Student student = new Student(firstName, secondName, lastName, dateB, id);
            userList.add(student);
        } else if (type == Type.TEACHER) {
            Teacher teacher = new Teacher(firstName, secondName, lastName, dateB, id);
            userList.add(teacher);
        }
    }

    private int getFreeId(Type type) {
        int lastId = 1;
        for (User user : userList) {
            if (user instanceof Teacher && type == Type.TEACHER) {
                lastId = Math.max(lastId, ((Teacher) user).getTeacherId() + 1);
            }
            if (user instanceof Student && type == Type.STUDENT) {
                lastId = Math.max(lastId, ((Student) user).getStudentId() + 1);
            }
        }
        return lastId;
    }

    public List<User> getAllUsersByType(Type type) {
        List<User> resultList = new ArrayList<>();
        for (User user : userList) {
            if ((user instanceof Teacher && type == Type.TEACHER) || (user instanceof Student && type == Type.STUDENT)) {
                resultList.add(user);
            }
        }
        return resultList;
    }

    public List<Student> getAllStudents() {
        List<Student> resultList = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student) {
                resultList.add((Student) user);
            }
        }
        return resultList;
    }

    public Teacher getTeacher() {
        for (User user : userList) {
            if (user instanceof Teacher) {
                return (Teacher) user;
            }
        }
        return null;
    }

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        return new StudentGroup(teacher, students);
    }
}
