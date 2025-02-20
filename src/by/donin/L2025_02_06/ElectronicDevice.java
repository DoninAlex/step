package by.donin.L2025_02_06;

public abstract class ElectronicDevice {
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

    public abstract void turnOn();


    public abstract void turnOff();


    public abstract String getDescription();

    public abstract String getStatus();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public boolean isOn() {
        return isOn;
    }
}
