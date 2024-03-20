package hm6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        studentGroup.addStudent(new Student(4, "Ann", "A", "A"));
        studentGroup.addStudent(new Student(2, "Petr", "P", "P"));
        studentGroup.addStudent(new Student(3, "Egor", "E", "E"));
        studentGroup.addStudent(new Student(1, "Fedor", "F", "F"));

        StudentView studentView = new StudentView();
        studentView.sendOnConsole(studentGroup.studentList);
        System.out.println();

        TeacherService teacherService = new TeacherService(new ArrayList<>());
        teacherService.addTeacher(new Teacher("Liza", "L", 1984));
        teacherService.addTeacher(new Teacher("Maks", "M", 1975));
        teacherService.addTeacher(new Teacher("Elena", "E", 1990));

        TeacherView teacherView = new TeacherView();
        teacherView.printTeachers(teacherService.getSortedTeacherList());
    }
}