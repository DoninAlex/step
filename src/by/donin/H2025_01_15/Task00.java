package by.donin.H2025_01_15;

import java.util.Scanner;

public class Task00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        // Ввод элементов массива
        System.out.println("Введите 10 элементов массива:");
        for (int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        // Подсчёт суммы элементов массива
        for (int i = 0; i < 10; i++){
            sum += arr[i];
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
}
