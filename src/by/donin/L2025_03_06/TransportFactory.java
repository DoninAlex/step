package by.donin.L2025_03_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TransportFactory {
    private final Random random = new Random();
    private List<String> models = List.of("BMW", "Mazda", "Audi", "Porsche", "Tesla", "Xiaomi");;

    public Transport getRandomNext() {
          if (random.nextInt(4) == 0) {
              return new Car(models.get(random.nextInt(models.size())));
          }
          return;
    }
}
