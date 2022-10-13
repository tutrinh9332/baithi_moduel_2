package sort;

import Models.Student;

import java.util.Comparator;

public class SortByScore implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        if (o1.getDiemTB() > o2.getDiemTB()) {
            return 1;
        }
        return -1;
    }
}
