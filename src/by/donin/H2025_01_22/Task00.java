package by.donin.H2025_01_22;

import by.donin.utils.ArrayUtil;

import java.util.Arrays;

public class Task00 {
    public static void main(String[] args) {
        int[] arr = ArrayUtil.generateIntArray(10, 0, 20);
        int[] arr2 = getCopyIntArray(arr);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr2 = " + Arrays.toString(arr2));
        int[] arr3 = copyIntSubArray(arr, 3, 4);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr3 = " + Arrays.toString(arr3));
        System.out.println("Массивы arr и arr2 " +
                (isIntArraysEqual(arr, arr2) ? "равны" : "не равны"));
        System.out.println("Массивы arr2 и arr3 " +
                (isIntArraysEqual(arr2, arr3) ? "равны" : "не равны"));

        int[] arr4 = {20, 10, 20, 10};
        System.out.println("arr4 = " + Arrays.toString(arr4));
        int index1 = findIndexOfArrayPreMaxElement(arr4);
        System.out.println("2-й по величине элемент: " +
                (index1 >= 0 ? arr4[index1] : "не найден (все элементы равны)"));

        int[] arr5 = {17, 25, 4, 82};
        System.out.println("arr5 = " + Arrays.toString(arr5));
        int[] unionArr = getUnionOfTwoIntArrays(arr4, arr5);
        System.out.println("unionArr = " + Arrays.toString(unionArr));
    }

    private static int[] getUnionOfTwoIntArrays(int[] array1, int[] array2) {
        int[] outArray = new int[array1.length + array2.length];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            outArray[index] = array1[i];
            index++;
        }
        for (int i = 0; i < array2.length; i++) {
            outArray[index] = array2[i];
            index++;
        }
        Arrays.sort(outArray);
        return outArray;
    }

    // Возвращает копию массива
    public static int[] getCopyIntArray(int[] srcArray) {
        return Arrays.copyOf(srcArray, srcArray.length);
    }

    // Возвращает копию части массива
    public static int[] copyIntSubArray(int[] srcArray, int startPos, int size) {
        int[] destArray = new int[size];
        System.arraycopy(srcArray, startPos, destArray, 0, size);
        return destArray;
    }

    // Сравнивает 2 массива
    public static boolean isIntArraysEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    // Находит 2-й по величине элемент массива, если элементы не повторяются, иначе вернёт "-1"
    public static int findIndexOfArrayPreMaxElement(int[] array) {
        int[] arr = new int[array.length];
        System.arraycopy(array, 0, arr, 0, array.length);
        Arrays.sort(arr);
        int index = -1; // Искомый индекс
        // Пробуем найти ближайший элемент, меньше максимального (исключаем повторы)
        int ind = -1;
        //int preMax = arr[ind];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }
        // Если нашли, возвращаем его индекс в оригинальном массиве
        if (ind >= 0) {
            for (int i = 0; i < array.length; i++) {
                index = Arrays.binarySearch(array, arr[ind]);
            }
        }
        return index;
    }
}
