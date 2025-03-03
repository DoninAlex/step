package by.donin.L2025_03_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import static by.donin.L2025_03_03.StudentFactory.students;


public class Main {
    public static void main(String[] args) {
        final int capacity = 100;
        //List<Student> students = new ArrayList<>(capacity);
        StudentFactory studentFactory = new StudentFactory();

        for (int i = 0; i < capacity; i++) {
            students.add(StudentFactory.getNext());
        }
        System.out.println("Размер students => " + students.size());

        System.out.println();
        System.out.println(find(students, "Александр"));

        remove("Александр");
        System.out.println("Размер students => " + students.size());

        List<Student> students2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            students2.add(StudentFactory.getNext());
        }
        System.out.println();
        System.out.println(">>> Склеиваем списки");
        addList(students, students2);
        System.out.println("Размер students => " + students.size());

        System.out.println();
        System.out.println(students.get(4));
        Student student1 = StudentFactory.getNext();
        System.out.println(">>> Заменяем на студента: " + student1);
        replace(students, 4, student1);
        System.out.println(students.get(4));

    }

    public static Student find(List list, String name) {
        for (Student student : students) {
            if (student.getName() == name) {
                return student;
            }
        }
        return null;
    }

    public static void remove (String name) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();
            if (next.getName() == name) {
                System.out.println("Удаляем студента: " + next.toString());
                iterator.remove();
            }
        }
    }

    public static void addList(List srcList, List destList) {
        srcList.addAll(destList);
    }

    public static void replace(List list, int index, Student newStudent) {
        list.set(index, newStudent);
    }


}
