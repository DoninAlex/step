package by.donin.L09_01_2025;

/*
Поиск числа
Напишите программу, которая запрашивает
у пользователя ввод чисел до тех пор,
пока не будет введено число 7. Если
пользователь вводит число 5, программа
должна пропустить его и продолжить выполнение.
*/

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Введите число (7 - для выхода).");
        while (true) {
            num = sc.nextInt();
            if (num == 7) {
                break;
            }
            if (num == 5) {
                continue;
            }
            System.out.println("Вы ввели " + num);
        }
        System.out.println("Завершение ввода.");
    }
}
