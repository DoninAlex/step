package by.donin.H2025_02_16;

import java.util.Random;

public class Recruit {
    private int id;

    private static int totalRecruits = 0;
    private Random random = new Random();
    private String[] firstNames = {"Павел", "Илья", "Василий", "Александр", "Геннадий", "Григорий"};
    private String[] middleNames = {"Сергеевич", "Федорович", "Васильевич", "Александрович", "Геннадьевич", "Григорьевич"};
    private String[] lastNames = {"Котиков", "Зайцев", "Печкин", "Албанов", "Петрушкин", "Следаков", "Пупкин", "Зубов"};

    private String firstName;
    private String middleName;
    private String lastName;
    private boolean valid;
    private String diagnosis;
    private double visionCoeff;
    private boolean flatFeet;
    private int implantCount;
    private int cardiogram;

    public Recruit() {
        this.id = ++totalRecruits;
        this.firstName = firstNames[random.nextInt(firstNames.length)];
        this.middleName = middleNames[random.nextInt(middleNames.length)];
        this.lastName = lastNames[random.nextInt(lastNames.length)];
        this.valid = true;
        this.diagnosis = "";
        this.visionCoeff = random.nextDouble(1.0) + 0.5;
        this.flatFeet = (random.nextInt(4) == 0);
        this.implantCount = random.nextInt(3);
        this.cardiogram = random.nextInt(160) + 40;
        //System.out.println(this.toString());
    }

    public String toString() {
        String out = "";
        out += "[" + id + "] " + lastName + " " + firstName + " " +
                middleName + " -- " + (valid ? "годен" : "не годен (" + diagnosis + ")");
        return out;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public double getVisionCoeff() {
        return visionCoeff;
    }

    public boolean isFlatFeet() {
        return flatFeet;
    }

    public int getImplantCount() {
        return implantCount;
    }

    public int getCardiogram() {
        return cardiogram;
    }

    public static int getTotalRecruits() {
        return totalRecruits;
    }

    public static void setTotalRecruits(int totalRecruits) {
        Recruit.totalRecruits = totalRecruits;
    }

}
