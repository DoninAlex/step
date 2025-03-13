package by.donin.L2025_03_13;

import java.util.Random;

public class Truck extends Transport {
    private int loadCapacity;
    private Random random = new Random();

    public Truck(String model, int speed, int loadCapacity,String licensePlate, int year) {
        super(model, speed, licensePlate, year);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Грузовик, " + super.toString() + ", рег. номер [" + getLicensePlate() + "]";
    }
}
