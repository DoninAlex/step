package by.donin.L2025_02_06;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("HP", "ProBook 6470b", 65,1.25);
        Smartphone smartphone = new Smartphone("Redmi", "Note 9S", 18, 12.0);
        TV tv = new TV("Sony", "BRAVIA", 120, 32);

        System.out.println(laptop.getDescription());
        System.out.println("Состояние > " + laptop.getStatus());
        laptop.turnOn();
        System.out.println("Состояние > " + laptop.getStatus());
        laptop.turnOff();
        System.out.println("Состояние > " + laptop.getStatus());

        System.out.println("\n" + smartphone.getDescription());
        System.out.println("Состояние > " + smartphone.getStatus());
        smartphone.turnOn();
        System.out.println("Состояние > " + smartphone.getStatus());
        smartphone.turnOff();
        System.out.println("Состояние > " + smartphone.getStatus());

        System.out.println("\n" + tv.getDescription());
        System.out.println("Состояние > " + tv.getStatus());
        tv.turnOn();
        System.out.println("Состояние > " + tv.getStatus());
        tv.turnOff();
        System.out.println("Состояние > " + tv.getStatus());
    }
}
