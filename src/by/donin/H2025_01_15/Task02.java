package by.donin.H2025_01_15;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        // Ввод элементов массива
        System.out.println("Введите 10 элементов массива:");
        for (int i = 0; i < 10; i++) {
            arr1[i] = sc.nextInt();
        }
        // Наполнение развёрнутого массива
        for (int i = 0; i < 10; i++) {
            arr2[i] = arr1[9 - i];
        }
        // Вывод массивов
        System.out.println("Начальный массив:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Развёрнутый массив:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
