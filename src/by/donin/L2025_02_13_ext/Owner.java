package by.donin.L2025_02_13_ext;

import java.util.Random;

public class Owner {
    private int id;
    private String name;
    private String surName;
    private boolean isMale;
    private static String[] maleNames = new String[5];
    private static String[] femaleNames = new String[5];
    private static String[] surNames = new String[5];
    private Pet[] pets = new Pet[0];
    private static int totalOwners = 0;
    private Random random = new Random();

    static {
        System.out.println("Класс Owner загружен в память!");
        surNames[0] = "Стаценко";
        surNames[1] = "Карпенко";
        surNames[2] = "Правенко";
        surNames[3] = "Буренко";
        surNames[4] = "Залетайло";

        maleNames[0] = "Саша";
        maleNames[1] = "Вася";
        maleNames[2] = "Петя";
        maleNames[3] = "Ваня";
        maleNames[4] = "Коля";

        femaleNames[0] = "Катя";
        femaleNames[1] = "Маша";
        femaleNames[2] = "Ира";
        femaleNames[3] = "Зина";
        femaleNames[4] = "Аня";
    }

    public Owner() {
        this.id = ++totalOwners;
        surName = surNames[random.nextInt(surNames.length)];
        isMale = random.nextBoolean();
        if(isMale) {
            name = maleNames[random.nextInt(maleNames.length)];
        } else {
            name = femaleNames[random.nextInt(femaleNames.length)];
        }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    public static int getTotalOwners() {
        return totalOwners;
    }

    public void addPet(Pet pet) {
        Pet[] pets1 = new Pet[pets.length + 1];
        for (int i = 0; i < pets.length; i++) {
            pets1[i] = pets[i];
        }
        pets1[pets1.length-1] = pet;
        pets = pets1;
        pet.setOwner(this);
    }
}
