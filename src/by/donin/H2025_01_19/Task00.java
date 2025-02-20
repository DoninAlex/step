package by.donin.H2025_01_19;

import by.donin.utils.ArrayUtil;

public class Task00 {
    public static void main(String[] args) {
        repeatCount();
        //findSpecialElementIndex();
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
