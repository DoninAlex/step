package by.donin.L2025_03_10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class TransportFactory {
    private static Random random = new Random();
    private static List<String> models = List.of("BMW", "Mazda", "Audi", "Porsche", "Tesla", "Xiaomi");
    private static List<String> fuelTypes = List.of("Бензиновый", "Газ", "Электро");


    public static Transport getRandomNext() {
        int transportKind = random.nextInt(3);


        if (transportKind == 0) {
            return new Car(models.get(random.nextInt(models.size())), 100 + random.nextInt(100), fuelTypes.get(random.nextInt(fuelTypes.size())), getRandomLicensePlate());
        } else if (transportKind == 1) {
            return new Bike(models.get(random.nextInt(models.size())), 130 + random.nextInt(100), random.nextBoolean(), getRandomLicensePlate());
        } else if (transportKind == 2) {
            return new Truck(models.get(random.nextInt(models.size())), 80 + random.nextInt(100), 100 + random.nextInt(300), getRandomLicensePlate());
        } else return null;
    }

    public String getRandomLicensePlate() {
        char asciiCharacter;
        String result = "";
        for (int i = 0; i < 4; i++) {
            result += random.nextInt(10);
        }
        result += " ";
        for (int i = 0; i < 2; i++) {
            result += (char)  + random.nextInt(26);
        }
        result += "-";
        result += random.nextInt(10);

        return result;
    }
}
