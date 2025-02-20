package by.donin.L2025_01_23;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        /*Building building1 = new Building(100,
                30,
                "кирпич",
                "Ленина");
        System.out.println(building1.getDescription());*/

        int buildingNumber = 200;
        Random random = new Random();
        Building[] buildings = new Building[buildingNumber];
        for (int i = 0; i < buildings.length; i++) {
            buildings[i] = new Building(
                    random.nextInt(100),
                    random.nextInt(30) + 1,
                    "кирпич",
                    "Ленина");
        }
        /*for (int i = 0; i < buildings.length; i++) {
            System.out.println((i +1) + "." + buildings[i].getDescription());
        }
        System.out.println("------------------------");*/
        for (int i = 0; i < buildings.length; i++) {
            if (buildings[i].windowNumber == 10) {
                buildings[i].material = "БЕТОН";
            }
            System.out.println((i +1) + "." + buildings[i].getDescription());
        }
    }
}
