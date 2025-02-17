package by.donin.H23_12_24;

// Задача 20.
//Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
//Если все числа равны, вивести любое из них.

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, averageint;
        double average;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // Вычисляем среднее арифметическое
        average = (a + b + c)/3.0;
        System.out.println("---------------");
        System.out.println("Среднее арифметическое: " + average);

        // Находим число, минимально отличающееся от среднего арифметического
        if (Math.abs(average - a) < Math.abs(average - b))
            averageint = a;
        else
            averageint = b;
        if (Math.abs(average - averageint) > Math.abs(average - c))
            averageint = c;

        // Вывод ответа

        System.out.println("Среднее число: " + averageint);
    }
}
