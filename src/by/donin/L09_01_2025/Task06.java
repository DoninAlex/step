package by.donin.L09_01_2025;

/*
Задача 5: Счетчик чисел
Напишите программу, которая считает
количество введенных пользователем чисел
до тех пор, пока не будет введено число 10.
Используйте break для выхода из цикла.
*/

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int num;
        System.out.println("Введите число (10 - для выхода).");
        while (true) {
            num = sc.nextInt();
            if (num == 10) {
                break;
            }
            count++;
        }
        System.out.println("Вы ввели " + count + " чисел.");
    }
}
