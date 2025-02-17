package by.donin.L2025_01_20;

import by.donin.utils.ArrayUtil;

import java.util.Arrays;

public class Task00 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        function1(x, y);
        System.out.println(x + " " + y);
    }

    public static void test() {
        int[] arr = new int[10];
        ArrayUtil.generateOriginIntArray(arr, 0, 10);
        System.out.println("Сгенерированный массив -> " + Arrays.toString(arr));
    }

    public static void function1 (int a, int b) {
        a = 10;
        b = 20;
    }
}
