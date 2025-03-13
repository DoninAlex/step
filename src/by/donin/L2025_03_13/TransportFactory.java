package by.donin.L2025_03_13;

import java.util.List;
import java.util.Random;

public class TransportFactory {
    private static Random random = new Random();
    private static final List<String> models = List.of("BMW", "Mazda", "Audi", "Porsche", "Tesla", "Xiaomi");
    private static final List<String> fuelTypes = List.of("Бензиновый", "Газ", "Электро");

    private TransportFactory() {
    }

    public static Transport getRandomNext() {
        int transportKind = random.nextInt(3);


        if (transportKind == 0) {
            return new Car(models.get(random.nextInt(models.size())), 130 + random.nextInt(100), fuelTypes.get(random.nextInt(fuelTypes.size())), getRandomLicensePlate(), 1970 + random.nextInt(70));
        } else if (transportKind == 1) {
            return new Bike(models.get(random.nextInt(models.size())), 150 + random.nextInt(100), random.nextBoolean(), getRandomLicensePlate(), 1970 + random.nextInt(70));
        } else if (transportKind == 2) {
            return new Truck(models.get(random.nextInt(models.size())), 120 + random.nextInt(100), 100 + random.nextInt(300), getRandomLicensePlate(), 1970 + random.nextInt(70));
        } else return null;
    }

    public static String getRandomLicensePlate() {
        char asciiCharacter;
        String result = "";
        for (int i = 0; i < 4; i++) {
            result += random.nextInt(10);
        }
        result += " ";
        for (int i = 0; i < 2; i++) {
            result += (char) (65 + random.nextInt(26));
        }
        result += "-";
        result += 1 + random.nextInt(9);

        return result;
    }
}
