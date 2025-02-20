package by.donin.H2025_02_16;

import java.util.Random;

public abstract class Doctor {
    private String name;
    private String surName;
    private String specialty;
    private Random random = new Random();
    private static String[] names = {"Павел", "Илья", "Василий", "Александр", "Геннадий", "Григорий", "Алексей", "Николай", "Владимир"};
    private static String[] surNames = {"Иванов", "Петров", "Сидоров", "Грибков", "Растеряев", "Глазко", "Шкет"};

    public Doctor() {
        this.name = names[random.nextInt(names.length)];
        this.surName = surNames[random.nextInt(surNames.length)];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public abstract void test(Recruit recruit);

    @Override
    public String toString() {
        return specialty + " > " + surName + " " + name;
    }
}
