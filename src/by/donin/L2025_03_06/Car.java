package by.donin.L2025_03_06;

import java.util.List;
import java.util.Random;

public class Car extends Transport{
    private String fuelType;
    private Random random;
    private final List<String> fuelTypes = List.of("Бензиновый", "Газ", "Электро");

    public Car(String model, int speed) {
        this.setModel(model);
        this.setSpeed(speed);
        this.fuelType = (fuelTypes.get(random.nextInt(fuelTypes.size())));
    }


    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Машина, " + super.toString();
    }
}
