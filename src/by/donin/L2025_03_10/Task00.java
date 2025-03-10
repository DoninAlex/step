package by.donin.L2025_03_10;

import by.donin.L2025_03_03.Student;

import java.util.*;

public class Task00 {
    public static void main(String[] args) {
        Student student1 = new Student("Саша", 21, 8);
        Student student2 = new Student("Петя", 25, 6);
        Student student3 = new Student("Катя", 25, 6);
        Student student4 = new Student("Вася", 25, 6);

        Map<Integer, Student> gradeToStudentMap = new HashMap<>();
        gradeToStudentMap.put(student1.getAge(), student1);
        gradeToStudentMap.put(student2.getAge(), student2);
        gradeToStudentMap.put(student3.getAge(), student3);
        Student student = gradeToStudentMap.get(21);
        System.out.println(gradeToStudentMap);
        System.out.println(student);

        System.out.println(gradeToStudentMap.containsValue(student2)); //false, т.к. перезаписали студентом 3

        Set<Integer> ages = gradeToStudentMap.keySet();

        // Пробежать по всей Map (по ключам и значениям), можно по Values() или Keys()
        for (Map.Entry<Integer, Student> entry : gradeToStudentMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        gradeToStudentMap.getOrDefault(90, new Student("Иван", 20, 10)); // Ответ по умолчанию при поиске

        gradeToStudentMap.putIfAbsent(student4.getAge(), student4); // Не добавит, т.к. ключ совпадает
        System.out.println(gradeToStudentMap);
        gradeToStudentMap.remove(21);
        System.out.println(gradeToStudentMap);

        Map<Integer, List<Student>> ageStudentsMap = new HashMap<>();
        List<Student> students = new ArrayList<>();
        students.add(student1);
        ageStudentsMap.put(student1.getAge(), students);
        List<Student> students1 = ageStudentsMap.get(student1.getAge());
        students1.add(student2);

        List<Student> studentsList = List.of(student1, student2,student3);
        for (Student s : studentsList) {
            ageStudentsMap.putIfAbsent(s.getAge(), new ArrayList<>());
            List<Student> list = ageStudentsMap.get(s.getAge());
            list.add(s);
        }

        System.out.println(ageStudentsMap);
        System.out.println("Название класса: " + student1.getClass().getSimpleName());
    }
}
