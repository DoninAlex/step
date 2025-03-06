package by.donin.L2025_03_06;

import by.donin.L2025_03_03.Student;
import by.donin.L2025_03_03.StudentFactory;
import by.donin.L2025_03_03.StudentNameComparator;

import java.sql.SQLOutput;
import java.util.*;

public class Task00 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Set<Student> studentsLinked = new LinkedHashSet<>();
        List<Student> studentList = new ArrayList<>();
        Set<Student> studentsTreeSet = new TreeSet<>(new StudentNameComparator());
        for (int i = 0; i < 1000; i++) {
            Student next = StudentFactory.getNext();
            students.add(next);
            studentList.add(next);
            studentsLinked.add(next);
            studentsTreeSet.add(next);
        }
        System.out.println(students);
        System.out.println(students.size());

        System.out.println(studentsLinked);
        System.out.println(studentsLinked.size());

        System.out.println(studentList);
        System.out.println(studentList.size());

        System.out.println(studentsTreeSet);
        System.out.println(studentsTreeSet.size());

        //List<Student> students1 = new ArrayList<>(students);

    }
}
