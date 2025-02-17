package by.donin.H23_12_24;

// Вычисление размера стипендии сиудента по 4-м оценкам

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        int mark;
        int markSum = 0;
        int positiveMarkCount = 0; // Кол-во оценок выше 3 баллов
        int specialMarkCount = 0; // Кол-во оценок выше 7 баллов
        int gradebookNumber; // Номер зачётной книжки

        float averageMark, avard;
        final float socialAvard = 1.0f;
        final float normalAvard = 2.5f;
        final float advancedAvardCoeficient = 2.0f;
        final float specialAvardCoeficient = 3.0f;

        Scanner sc = new Scanner(System.in);

        // Ввод номера зачётки
        System.out.print("Введите номер зачётки: ");
        gradebookNumber = sc.nextInt();

        // Ввод оценок, подсчёт их суммы
        System.out.println("Введите 4 оценки: ");
        for (int i = 0; i < 4; i++) {
            mark = sc.nextInt();
            if (mark >= 4)
                positiveMarkCount++;
            if (mark >= 8)
                specialMarkCount++;
            markSum += mark;
        }

        // Оценка результата
        if (positiveMarkCount < 2) {
            System.out.println("Студент отчислен за неуспеваемость");
        } else if (positiveMarkCount <4) {
            System.out.println("Студент имеет академическую задолженность");
            System.out.println("Стипендия не начислена");
        } else {
            averageMark = (float)markSum/4;
            System.out.println("Средний балл в сессию: " + averageMark);

            //Вычисление размера стипендии
            if (averageMark <= 5) {
                avard = socialAvard;        
            } else if (averageMark <= 7) {
                avard = normalAvard;
            } else if (averageMark > 9 && specialMarkCount == 4) {
                avard = normalAvard * specialAvardCoeficient;
            } else {
                avard = normalAvard * advancedAvardCoeficient;
            }

            // Вывод размера стипендии
            System.out.print("Ежемесячная стипендия: " + (int)avard
                + " руб. " + (int)((avard - (int)avard) * 100) + " коп.");
            if (gradebookNumber%2 > 0)
                System.out.println("(студент - платник)");
        }
    }
}
