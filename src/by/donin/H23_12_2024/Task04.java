package by.donin.H23_12_2024;

// Задача 13. Светофор

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        float t, simple_t;
        Scanner sc = new Scanner(System.in);

        // Ввод минут t в пределах часа
        t = sc.nextFloat();

        // Приводим к 5-минутному периоду
        simple_t = ((int)t)%5 + t - (int)t;
        System.out.println(simple_t);

        if (simple_t >= 0 && simple_t < 3) {
            System.out.println("зелёный");
        } else if (simple_t >= 3 && simple_t <4) {
            System.out.println("жёлтый");
        } else {
            System.out.println("красный");
        }
    }
}
