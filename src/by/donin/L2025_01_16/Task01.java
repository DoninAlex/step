package by.donin.L2025_01_16;

import by.donin.utils.ArrayUtil;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        //deleteNumFromArray();
        //isSimetricPalindrome();
        //pairNumber();
        repeatCount();

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
        int[] arr =  {1, 5, 7, -1, 5};
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

    private static void repeatCount () {
        int[] arr = ArrayUtil.generateIntArray(20, 1,6);
        int[] values = new int[arr.length];
        int valuesCount = 0;
        int num;
        boolean isInValues;
        for (int i = 0; i < arr.length; i++) {
            num = arr[i];
            isInValues = false;
            for (int j = 0; j < valuesCount; j++) {
                if (num == values[j]) {
                    isInValues = true;
                    break;
                }
            }
            if(isInValues) {
                values[valuesCount] = num;
                valuesCount++;
            }
        }
        System.out.println("Повторяющиеся числа:");
        for (int i = 0; i < valuesCount; i++) {
            System.out.print(values[i] + "");
        }
    }
}
