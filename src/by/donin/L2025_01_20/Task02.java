package by.donin.L2025_01_20;

import by.donin.utils.ArrayUtil;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        searchMyPhoneNumber();
    }

    public static void searchMyPhoneNumber(){
        long[] numbers = ArrayUtil.generateLongArray(10000000, 375290000000L, 375299999999L);
        long myNumber = 375297629588L;
        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, myNumber);
        System.out.println(index >= 0 ? "Найден номер под индексом " + index : "Номер не найден");
    }
}
