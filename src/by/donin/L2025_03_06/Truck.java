package by.donin.L2025_03_06;

import java.util.Random;

public class Truck extends Transport{
    private int loadCapacity;
    private Random random;

    public Truck(String model, int speed) {
        this.loadCapacity = (100 + random.nextInt(300));
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Грузовик, " + super.toString();
    }
}
