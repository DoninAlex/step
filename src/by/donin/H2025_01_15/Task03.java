package by.donin.H2025_01_15;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n;
        int ind = -1;
        // Ввод элементов массива
        System.out.println("Введите 10 элементов массива:");
        for (int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Введите число, которое нужно найти в массиве:");
        n = sc.nextInt();
        // Поиск элемента в массиве
        for (int i = 0; i < 10; i++){
            if (arr[i] == n) {
                ind = i;
                break;
            }
        }
        System.out.println("Индекс искомого элемента в массиве: " + ind);
    }
}
