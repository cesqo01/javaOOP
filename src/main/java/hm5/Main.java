package hm5;

import hm5.controller.Controller;
import hm5.model.StudentGroup;
import hm5.service.DataService;

public class Main {
    public static void main(String[] args) {
        DataService dataService = new DataService();
        Controller controller = new Controller(dataService);

        controller.createStudent("A", "S", "1", "01-01-2000");

        controller.createStudent("B", "J", "2", "02-02-2000");
        controller.getAllStudents();

        controller.createTeacher("J", "D", "T1", "03-03-1980");
        controller.createTeacher("U", "D", "T2", "04-04-1980");
        controller.getAllTeachers();

        controller.aggregateData();
    }
}
