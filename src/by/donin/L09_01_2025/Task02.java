package by.donin.L09_01_2025;

/*
Прерывание цикла
Напишите программу, которая запрашивает
у пользователя ввод чисел, пока не будет
введено число 0. Если число 0 введено,
программа должна завершить ввод и вывести
сообщение о завершении.
*/

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Введите число (0 - для выхода).");
        while (true){
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            System.out.println("Вы ввели " + num);
        }
        System.out.println("Вы ввели 0. Завершение ввода.");
    }
}
