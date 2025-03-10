package by.donin.L2025_03_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double grade;
    static List<String> names = new ArrayList<>();
    static Random random = new Random();

    static {
        names.add("Василий");
        names.add("Александр");
        names.add("Николай");
        names.add("Пётр");
        names.add("Владимир");
        names.add("Сергей");
        names.add("Григорий");
    }

    public Student() {
        name = names.get(random.nextInt(7));
        age = 18 + random.nextInt(50);
        grade = 5.0 + random.nextDouble(5.0);
        //System.out.println(this.toString());
    }

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + ", " + age + " лет, средний балл: " + grade;
    }


    @Override
    public int compareTo(Student o) {
        int nameCompare = this.name.compareTo(o.name);
        if (nameCompare != 0) {
            return nameCompare;
        }
        // Если имена совпали, сравниваем по возрасту
        return Integer.compare(this.age, o.age);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
