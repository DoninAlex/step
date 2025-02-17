package by.donin.L2025_01_16;

import by.donin.utils.ArrayUtil;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        //deleteNumFromArray();
        //isSimetricPalindrome();
        //pairNumber();
        //repeatCount();
        findSpecialElementIndex();

    }

    private static void deleteNumFromArray() {
        int[] intArray = ArrayUtil.generateIntArray(10, 0, 60);
        int deleteIndex = 2; // Удалим элемент с индексом 2
        if (deleteIndex >= 0 && deleteIndex < intArray.length) {
            int[] outIntArray = new int[intArray.length - 1];
            int ind = 0;
            for (int i = 0; i < outIntArray.length; i++) {
                if (i != deleteIndex) {
                    outIntArray[ind] = intArray[i];
                    ind++;
                }
            }
            System.out.println(Arrays.toString(outIntArray));
        } else {
            System.out.println("Индекс вне диапазона");
        }
    }

    private static void isSimetricPalindrome() {
        int[] arr = {1, 2, 3, 3, 4, 3, 2, 1};
        boolean simmetric = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                simmetric = false;
                break;
            }
        }
        System.out.println(simmetric);
    }

    private static void pairNumber() {
        int[] arr = {1, 5, 7, -1, 5};
        int k = 6;
        int num = 0; // Количество пар в массиве, сумма которых равна k

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    num++;
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
        System.out.println("Количество пар: " + num);
    }

    private static void repeatCount() {
        int[] arr = ArrayUtil.generateIntArray(20, 1, 6);
        int[] values = new int[arr.length];
        int valuesCount = 0;
        int num;
        int count;
        boolean letterA;
        boolean isInValues;

        // Поиск различных чисел в массиве
        for (int i = 0; i < arr.length; i++) {
            num = arr[i];
            isInValues = false;
            for (int j = 0; j < valuesCount; j++) {
                if (num == values[j]) {
                    isInValues = true;
                    break;
                }
            }
            if (isInValues == false) {
                values[valuesCount] = num;
                valuesCount++;
            }
        }
        System.out.println("Различные числа:");
        for (int i = 0; i < valuesCount; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();

        // Подсчёт количества вхождений
        for (int i = 0; i < valuesCount; i++) {
            count = 0;
            letterA = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == values[i]) {
                    count++;
                }
            }
            if (count >= 2 && count <= 4) {
                letterA = true;
            }
            System.out.print(values[i] + " встречается " + count + " раз");
            System.out.println(letterA ? "а" : "");
        }
    }

    private static void findSpecialElementIndex() {
        int[] arr = {2, 3, 14, -5, 5, -5, 2};
        int index = -1;

        //Вывод массива
        System.out.println("Массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Поиск элемента
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != 0 && arr[i-1] != 0  && arr[i+1] != 0){
                if (arr[i] % arr[i-1] == 0 && arr[i] % arr[i+1] == 0) {
                    index = i;
                    break;
                }
            }
        }

        // Вывод результата поиска
        if (index > 0) {
            System.out.println("Индекс искомого элемента: " + index);
        } else {
            System.out.println("Элемента, удовлетворяющего условиям, нет");
        }
    }
}
