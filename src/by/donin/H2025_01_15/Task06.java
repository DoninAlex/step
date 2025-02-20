package by.donin.H2025_01_15;

public class Task06 {
    public static void main(String[] args) {
        int[] arr = {45, 45, 4, 40, 45};
        int max;
        int n; // 2-й по величине элемент массива
        // Подсчёт максимального элемента массива
        max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // Поиск 2-го по величине элемента
        n = Integer.MIN_VALUE;
        int j = 0;
        do {
            if (arr[j] != max){
                if (arr[j] > n){
                    n = arr[j];
                }
            }
            j++;
        } while (j < arr.length);
        // Вывод ответа
        System.out.println("2-й по величине элемент: " + n);
    }
}
