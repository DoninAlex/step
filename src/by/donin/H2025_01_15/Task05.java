package by.donin.H2025_01_15;

public class Task05 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};
        int[] sumArray = new int[arr1.length + arr2.length];
        // Заполнение объединённого массива
        int ind = 0;
        for (int i = 0; i < arr1.length; i++) {
            sumArray[ind] = arr1[i];
            ind++;
        }
        for (int i = 0; i < arr2.length; i++) {
            sumArray[ind] = arr2[i];
            ind++;
        }
        // Вывод результирующего массива
        for (int i = 0; i < sumArray.length; i++) {
            System.out.print(sumArray[i] + " ");
        }
    }
}
