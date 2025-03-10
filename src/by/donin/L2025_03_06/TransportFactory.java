package by.donin.L2025_03_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TransportFactory {
    private Random random = new Random();
    private List<String> models = List.of("BMW", "Mazda", "Audi", "Porsche", "Tesla", "Xiaomi");
    private final List<String> fuelTypes = List.of("Бензиновый", "Газ", "Электро");


    public Transport getRandomNext() {
        int transportKind = random.nextInt(3);
        if (transportKind == 0) {
            return new Car(models.get(random.nextInt(models.size())), 100 + random.nextInt(100), fuelTypes.get(random.nextInt(fuelTypes.size())));
        } else if (transportKind == 1) {
            return new Bike(models.get(random.nextInt(models.size())), 130 + random.nextInt(100), random.nextBoolean());
        } else if (transportKind == 2) {
            return new Truck(models.get(random.nextInt(models.size())), 80 + random.nextInt(100), 100 + random.nextInt(300));
        } else return null;
    }
}
