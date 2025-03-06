package by.donin.L2025_03_03;

import java.util.*;

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
        System.out.println(findStudent(students, "Александр"));

        removeStudent("Александр");
        System.out.println("Размер students => " + students.size());

        final List<Student> students2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            students2.add(StudentFactory.getNext());
        }
        System.out.println();
        System.out.println(">>> Склеиваем списки");
        addList(students, students2);
        System.out.println("Размер students => " + students.size());

        // Заменяем студента по индексу
        System.out.println();
        System.out.println(students.get(4));
        Student student1 = StudentFactory.getNext();
        System.out.println(">>> Заменяем на студента: " + student1);
        replaceStudent(students, 4, student1);
        System.out.println(students.get(4));

        //sortArray(students);
        //System.out.println(students);

        sortStudentsByComparator(students, new StudentNameComparator());
        System.out.println(students);
    }

    private static void sortArray(List<Student> students) {
        Collections.sort(students);
    }

    private static void sortStudentsByComparator(List<Student> students2, Comparator<Student> comparator) {
        students2.sort(comparator);
        //Collections.sort(students2, comparator); // Второй вариант
    }

    public static Student findStudent (List list, String name) {
        for (Student student : students) {
            if (name.equals(student.getName())) {
                return student;
            }
        }
        return null;
    }

    public static void removeStudent(String name) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student nextStudent = iterator.next();
            if (name.equals(nextStudent.getName())) {
                System.out.println("Удаляем студента: " + nextStudent.toString());
                iterator.remove();
            }
        }
    }

    public static void addList(List srcList, List destList) {
        srcList.addAll(destList);
    }

    public static void replaceStudent(List list, int index, Student newStudent) {
        if (list.size() < (index) || index < 0) {
            return;
        }
        list.set(index, newStudent);
    }


}
