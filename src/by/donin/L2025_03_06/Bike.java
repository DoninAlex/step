package by.donin.L2025_03_06;

import java.util.Random;

public class Bike extends Transport{
    private boolean hasSidecar;
    private Random random = new Random();

    public Bike(String model, int speed) {
        this.setModel(model);
        this.setSpeed(speed);
        this.hasSidecar = (random.nextBoolean());
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "Мотоцикл, " + super.toString();
    }
}
