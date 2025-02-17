package by.donin.L23_12_2024;

import java.util.Scanner;

// Тема: switch-case
public class Task00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //int b = sc.nextInt();
        System.out.println("Выводим переменную a: " + a);
        //System.out.println("Выводим переменную b: " + b);
        switch (a) {
            case 1:
                System.out.println("Переменная a = один");
                break;
            case 2:
                System.out.println("Переменная a = два");
                break;
            case 3:
                System.out.println("Переменная a = три");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Переменная a = 4 или 5 или 6");
                break;
            default:
                System.out.println("Ни одно из условий не сработало!");
        }
    }
}
