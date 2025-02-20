package by.donin.L2025_02_13;

import java.util.Random;

public abstract class Pet extends Animal {
    private static String[] surNames = new String[5];
    private Random random = new Random();

    static {
        surNames[0] = "Стаценко";
        surNames[1] = "Карпенко";
        surNames[2] = "Привалов";
        surNames[3] = "Богров";
        surNames[4] = "Залеталов";
    }

    private String masterName;
    private String masterSurName;

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public Pet(String name, String species, int age, String masterName) {
        super(name, species, age);
        this.masterName = masterName;
        this.masterSurName = surNames[random.nextInt(surNames.length)];
    }

    @Override
    public abstract void makeSound();

    @Override
    public abstract void move();

    @Override
    public abstract void eat();

    @Override
    public String toString() {
        return super.toString() +
                " (Домашнее животное, хозяин: " + masterSurName +
                " " + masterName + ")";
    }

    public void play() {
        System.out.println(getName() + " играет с хозяином " + masterName);
    }
}
