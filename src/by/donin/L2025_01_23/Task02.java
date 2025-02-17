package by.donin.L2025_01_23;

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        int buildingNumber = 200;
        Random rand = new Random();
        Building[] buildings = new Building[buildingNumber];
        for (int i = 0; i < buildingNumber; i++) {
            buildings[i] = new Building(
                    rand.nextInt(100),
                    rand.nextInt(30) + 1,
                    "кирпич",
                    "Ленина",
                    rand.nextInt(46) + 4,
                    rand.nextInt(125) + 1900
            );
        }
        for (int i = 0; i < buildings.length; i++) {
            System.out.println((i +1) + "." + buildings[i].getDescription());
        }
        // Находим самое высокое здание
        int maxHeightIndex = -1;
        int maxHeight = 0;
        for (int i = 0; i < buildings.length; i++) {
            if (buildings[i].height > maxHeight) {
                maxHeight = buildings[i].height;
                maxHeightIndex = i;
            }
        }
        System.out.println("Самое высокое здание:");
        System.out.println((maxHeightIndex +1) + "." + buildings[maxHeightIndex].getDescription());
        // Находим самое старое здание
        int minYear = 2100;
        int minYearIndex = -1;
        for (int i = 0; i < buildings.length; i++) {
            if (buildings[i].yearBuilt < minYear) {
                minYear = buildings[i].yearBuilt;
                minYearIndex = i;
            }
        }
        System.out.println("Самое старое здание:");
        System.out.println((minYearIndex +1) + "." + buildings[minYearIndex].getDescription());
    }
}
