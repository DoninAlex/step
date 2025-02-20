package by.donin.H2025_01_15;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int max;
        // Ввод элементов массива
        System.out.println("Введите 10 элементов массива:");
        for (int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        // Подсчёт максимального элемента массива
        max = arr[0];
        for (int i = 1; i < 10; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимальный элемент массива: " + max);
    }
}
