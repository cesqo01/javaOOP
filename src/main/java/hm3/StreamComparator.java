package hm3;

class StreamComparator {
    public int compare(StudentGroup sg1, StudentGroup sg2) {
        return sg1.getStudentList().size() - sg2.getStudentList().size();
    }
}
