package by.donin.L2025_01_20;

import by.donin.utils.ArrayUtil;

import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        int[] arr = ArrayUtil.generateIntArray(20, 0, 60);
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


}
