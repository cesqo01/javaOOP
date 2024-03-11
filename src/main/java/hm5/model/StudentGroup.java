package hm5.model;

import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List<Student> students;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher= teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        this.students.add(student);
    }

    public void deleteStudent(Student student) {
        this.students.remove(student);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teacher: ").append(teacher.toString()).append("\n");
        sb.append("Students: \n");
        for (Student student : students) {
            sb.append(student.toString()).append("\n");
        }
        return sb.toString();
    }
}
