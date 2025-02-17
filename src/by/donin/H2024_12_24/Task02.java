package by.donin.H23_12_24;

// Вычисление выражения вида (N=6) 6^2 − 5^2 + 4^2 − 3^2 + 2^2 − 1^2 = 21

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int coef = 1;
        int sum = 0;
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите N: ");
        n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            if (i < n && coef > 0)
                System.out.print("+");
            System.out.print(coef * i + "^2");
            sum += coef * i * i;
            coef *= -1;
        }

        // Вывод результата
        System.out.println(" = " + sum);
    }
}
