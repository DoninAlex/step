package by.donin.H23_12_24;

// Лесенки

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Убывающая лесенка
        for (int i = n; i > 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j + "");
            }
            System.out.println();
        }

        System.out.println();

        // Нарастающая лесенка
        for (int i = 1; i <= n; i++){
            for (int j = i; j > 0; j--){
                System.out.print(j + "");
            }
            System.out.println();
        }
    }
}
