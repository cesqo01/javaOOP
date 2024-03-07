package hm4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TeacherService {
    private List<Teacher> teacherList;

    public TeacherService(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    public List<Teacher> getSortedTeacherList() {
        List<Teacher> sortedList = new ArrayList<>(teacherList);
        Collections.sort(sortedList);
        return sortedList;
    }

    public List<Teacher> getSortedTeacherListByLastName() {
        List<Teacher> sortedList = new ArrayList<>(teacherList);
        Collections.sort(sortedList, Comparator.comparing(Teacher::getLastName));
        return sortedList;
    }

}