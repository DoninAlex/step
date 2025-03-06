package by.donin.L2025_03_06;

import java.util.Objects;

public abstract class Transport {
    private String model;
    private int speed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(model);
    }

    @Override
    public String toString() {
        return "Модель: " + model + ", макс. скорость: " + speed;
    }
}
