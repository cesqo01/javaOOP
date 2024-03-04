package hm3;

import java.util.Collections;
import java.util.List;

public class StreamService {
    public void sortStreamList(List<Stream> streams) {
        StreamComparator comparator = new StreamComparator();
        Collections.sort(streams, (s1, s2) -> comparator.compare(s1.getStudentGroups().get(0), s2.getStudentGroups().get(0)));
    }
}
