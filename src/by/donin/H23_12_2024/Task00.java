package by.donin.H23_12_2024;

// Рассчёт коммунальных платежей

import java.util.Scanner;

public class Task00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String MINUS = "--------------------------------------";
        final double GAS_TARIFF = 20.0;
        final double HOT_WATER_TARIFF = 20.0;
        final double COLD_WATER_TARIFF = 20.0;
        final double ENERGY_TARIFF = 20.0;
        final double FLAT_TARIFF = 20.0;

        System.out.println("Программа расчёта квартплаты и коммунальных платежей");
        System.out.println(MINUS);

        // Ввод показателей
        System.out.print("Введите объём потреблённого газа (м. куб.)............: ");
        int gas = sc.nextInt();
        System.out.print("Введите объём потреблённой горячей воды (м. куб.).....: ");
        int hotWater = sc.nextInt();
        System.out.print("Введите объём потреблённой холодной воды (м. куб.)....: ");
        int coldWater = sc.nextInt();
        System.out.print("Введите объём потреблённой электроэнергии (кВт * ч)...: ");
        int energy = sc.nextInt();
        System.out.print("Введите площадь квартиры (м. кв.).....................: ");
        double flatSquare = sc.nextDouble();

        double total = 0;
        double tGas, tColdWater, tHotWater, tEnergy, tFlat;

        //Рассчёт сумм
        tGas = GAS_TARIFF * gas;
        total += tGas;
        tColdWater = COLD_WATER_TARIFF * (hotWater + coldWater);
        total += tColdWater;
        tHotWater = HOT_WATER_TARIFF * hotWater;
        total += tHotWater;
        tEnergy = ENERGY_TARIFF * energy;
        total += tEnergy;
        tFlat = FLAT_TARIFF * flatSquare;
        total += tFlat;

        // Вывод рассчётов
        System.out.println("Сумма Ваших платежей:");
        System.out.println("За газ..............: "
                + (int)(tGas / 100) + " руб. "
                + ((int)(tGas % 100) < 10 ? "0" : "") + (int)(tGas % 100) + " коп.");
        System.out.println("За воду.............: "
                + (int)(tColdWater / 100) + " руб. "
                + ((int)(tColdWater % 100) < 10 ? "0" : "") + (int)(tColdWater % 100) + " коп.");
        System.out.println("За электроэнергию...: "
                + (int)(tEnergy / 100) + " руб. "
                + ((int)(tEnergy % 100) <10 ? "0" : "") + (int)(tEnergy % 100) + " коп.");
        System.out.println("За подогрев воды....: "
                + (int)(tHotWater / 100) + " руб. "
                + ((int)(tHotWater % 100) < 10 ? "0" : "") + (int)(tHotWater % 100) + " коп.");
        System.out.println("За квартиру.........: "
                + (int)(tFlat / 100) + " руб. "
                + ((int)(tFlat % 100) < 10 ? "0" : "") + (int)(tFlat % 100) + " коп.");

        //Вывод ИТОГО
        System.out.println(MINUS);
        System.out.println("Итого...............: "
                + (int)(total / 100) + " руб. "
                + ((int)(total % 100) < 10 ? "0" : "") + (int)(total % 100) + " коп.");

    }
}
