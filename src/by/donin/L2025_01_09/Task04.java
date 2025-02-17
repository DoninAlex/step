package by.donin.L09_01_2025;

/*
Задача 3: Сумма положительных чисел
Напишите программу, которая запрашивает
у пользователя ввод чисел до тех пор,
пока не будет введено отрицательное число.
Подсчитайте сумму всех введенных положительных
чисел. Используйте break для выхода из цикла.
*/

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        while (true) {
           num = sc.nextInt();
           if (num < 0) {
               break;
           }
           sum += num;
        }
        System.out.println("Сумма введённых положительных чисел: " + sum);
    }
}
