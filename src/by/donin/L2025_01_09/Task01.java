package by.donin.L09_01_2025;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i > 5){
            if (i == 8){
                System.out.println("i = 8 и мы не выполняем код ниже");
                i--;
                continue;
            }
            if (i == 6){
                System.out.println("i = 6 и мы прекращаем while");
                break;
            }
            System.out.println(i);
            i--;
        }
    }
}
