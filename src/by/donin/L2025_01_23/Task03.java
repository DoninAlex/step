package by.donin.L2025_01_23;

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        int buildingNumber = 200;
        Random random = new Random();
        String[] streets = {"Ленина", "Герцена", "Пушкина", "Гоголя"};
        String[] materials = {"кирпича", "бетона", "газосиликатного блока", "деревянного бруса"};
        Building[] buildings = new Building[buildingNumber];
        for (int i = 0; i < buildingNumber; i++) {
            buildings[i] = new Building(
                    random.nextInt(100),
                    random.nextInt(30) + 1,
                    materials[random.nextInt(4)],
                    streets[random.nextInt(4)],
                    random.nextInt(46) + 4,
                    random.nextInt(125) + 1900
                    );
        }
        for (int i = 0; i < buildings.length; i++) {
            System.out.println((i +1) + "." + buildings[i].getDescription());
        }
        // Находим самое новое здание из бетона, высота которого превышает 40 м
        int maxYear = 1900;
        int maxYearIndex = -1;
        for (int i = 0; i < buildings.length; i++) {
            if (buildings[i].material == "бетона" && buildings[i].height > 40) {
                if (buildings[i].yearBuilt > maxYear) {
                    maxYear = buildings[i].yearBuilt;
                    maxYearIndex = i;
                }
            }
        }
        if (maxYearIndex > 0) {
            System.out.println("Самое новое здание из бетона, высота которого превышает 40 м:");
            System.out.println((maxYearIndex + 1) + "." + buildings[maxYearIndex].getDescription());
        } else {
            System.out.println("Нет зданий, удовлетворяющим критериям.");
        }
    }
}
