package by.donin.L2025_01_30;

import java.util.Arrays;

public class Car {
    String make;
    String model;
    int year;
    Wheel[] wheel;

    public Car(String make, String model, int year, Wheel[] wheels) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.wheel = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", wheel=" + Arrays.toString(wheel) +
                '}';
    }
}
