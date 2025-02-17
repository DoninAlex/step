package by.donin.L09_01_2025;

/*
Задача 2: Пропуск четных чисел
Напишите программу, которая выводит
все нечетные числа от 1 до 20,
используя цикл for. Пропустите четные
числа с помощью оператора continue.
*/

public class Task03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i%2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
