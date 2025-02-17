package by.donin.L2025_02_06;

public class ElectronicDevice {
    private String brand;
    private String model;
    private int power;
    private boolean isOn;

    public ElectronicDevice(String brand, String model, int power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("### Устройство " +  model + " от " + brand + " включено.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("### Устройство " +  model + " от " + brand + " выключено.");
    }

    public String getDescription() {
        return "[Устройство] " + brand + " " + model + ", мощность: " + power + " Вт";
    }

    public String getStatus() {
        return "[Устройство] " + brand + " " + model +
                (isOn ? " включено" : " выключено");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public boolean isOn() {
        return isOn;
    }
}
