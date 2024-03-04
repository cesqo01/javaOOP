package hm3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Alice"));
        students1.add(new Student("Petr"));
        StudentGroup group1 = new StudentGroup(students1);

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Charlie"));
        students2.add(new Student("Ivan"));
        students2.add(new Student("Ann"));
        StudentGroup group2 = new StudentGroup(students2);

        List<StudentGroup> groups1 = new ArrayList<>();
        groups1.add(group1);
        Stream stream1 = new Stream(groups1);

        List<StudentGroup> groups2 = new ArrayList<>();
        groups2.add(group2);
        Stream stream2 = new Stream(groups2);

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        StreamService streamService = new StreamService();
        streamService.sortStreamList(streams);

        for (Stream stream : streams) {
            System.out.println("Students in the  group of this stream:");
            for (Student student : stream.getStudentGroups().get(0).getStudentList()) {
                System.out.println(student.getName());
            }
        }
    }
}
