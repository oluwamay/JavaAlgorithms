package Streams;

import java.util.Comparator;

public class StudentCompare implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.getScore() - o2.getScore());
    }
}
