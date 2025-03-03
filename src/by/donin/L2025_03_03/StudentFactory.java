package by.donin.L2025_03_03;

import java.util.ArrayList;
import java.util.List;

public class StudentFactory {
    static List<Student> students= new ArrayList<>();
    public static Student getNext() {
        return new Student();
    }
}
