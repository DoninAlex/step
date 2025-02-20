package by.donin.H2025_01_15;

public class Task04 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5}; // пример массива
        int indexToRemove = 2; // индекс для удаления
        int[] array2 = new int[array1.length - 1];
        // Наполнение нового массива элементами
        for (int i = 0; i < array2.length; i++) {
            if (i != indexToRemove) {
                array2[i] = array1[i];
            }
        }
        // Вывод нового массива
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
