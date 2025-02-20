package by.donin.L2025_02_06;

public class Main {
    public static void main(String[] args) {
        ElectronicDevice laptop = new Laptop("HP", "ProBook 6470b", 65,1.25);
        ElectronicDevice smartphone = new Smartphone("Redmi", "Note 9S", 18, 12.0);
        ElectronicDevice tv = new TV("Sony", "BRAVIA", 120, 32);

        ElectronicDevice[] electronicDevices = {laptop, smartphone, tv};

        for(ElectronicDevice device : electronicDevices) {
            System.out.println("\n" + device.getDescription());
            System.out.println("Состояние > " + device.getStatus());
            device.turnOn();
            System.out.println("Состояние > " + device.getStatus());
            device.turnOff();
            System.out.println("Состояние > " + device.getStatus());
        }


    }
}
