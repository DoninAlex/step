package by.donin.L2025_02_06;

public class TV extends ElectronicDevice{
    private int screenSize;

    public TV(String brand, String model, int power, int screenSize) {
        super(brand, model, power);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("### Устройство " +  getModel() + " от " + getBrand() + " включено.");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("### Устройство " +  getModel() + " от " + getBrand() + " выключено.");
    }

    @Override
    public String getDescription() {
        return "[Устройство] " + getBrand() + " " + getModel() + ", мощность: " + getPower() + " Вт" +
                ", размер экрана: " +
                screenSize + " дюймов";
    }

    @Override
    public String getStatus() {
        return "Телевизор " + (super.isOn() ? "включен" : "выключен");
    }
}
