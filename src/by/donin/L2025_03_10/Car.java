package by.donin.L2025_03_10;

import java.util.Random;

public class Car extends Transport {
    private String fuelType;
    private Random random = new Random();

    public Car(String model, int speed, String fuelType,String licensePlate) {
        super(model, speed, licensePlate);
        this.fuelType = fuelType;
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
