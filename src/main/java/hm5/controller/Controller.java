package hm5.controller;

import hm5.model.*;
import hm5.service.DataService;
import hm5.view.StudentView;

import java.util.List;

import java.util.List;

public class Controller {
    private DataService dataService;

    public Controller(DataService dataService) {
        this.dataService = dataService;
    }

    public void createStudent(String firstName, String secondName, String lastName, String dateB) {
        dataService.create(firstName, secondName, lastName, dateB, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String lastName, String dateB) {
        dataService.create(firstName, secondName, lastName, dateB, Type.TEACHER);
    }

    public void getAllStudents() {
        List<User> students = dataService.getAllUsersByType(Type.STUDENT);
        for (User student : students) {
            System.out.println(student);
        }
    }

    public void getAllTeachers() {
        List<User> teachers = dataService.getAllUsersByType(Type.TEACHER);
        for (User teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void aggregateData() {
        List<Student> students = dataService.getAllStudents();
        Teacher teacher = dataService.getTeacher();
        StudentGroup studentGroup = dataService.createStudentGroup(teacher, students);

        System.out.println("Учебная группа: " + studentGroup);
    }
}