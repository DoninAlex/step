package by.donin.L2025_03_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TransportFactory {
    private final Random random = new Random();
    private List<String> models = List.of("BMW", "Mazda", "Audi", "Porsche", "Tesla", "Xiaomi");
    ;

    public Transport getRandomNext() {
        int transportKind = random.nextInt(4);
        if (transportKind == 0) {
            return new Car(models.get(random.nextInt(models.size())), 100 + random.nextInt(100));
        } else if (transportKind == 1) {
            return new Bike(models.get(random.nextInt(models.size())), 130 + random.nextInt(100));
        } else {
            return new Truck(models.get(random.nextInt(models.size())), 80 + random.nextInt(100));
        }
    }
}
