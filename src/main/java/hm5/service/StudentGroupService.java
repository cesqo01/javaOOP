package hm5.service;

import hm5.model.Student;
import hm5.model.StudentGroup;
import hm5.model.Teacher;

import java.util.List;

public class StudentGroupService {
    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        return new StudentGroup(teacher, students);
    }
}
