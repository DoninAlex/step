package by.donin.L2025_02_06;

public class TV extends ElectronicDevice{
    private int screenSize;

    public TV(String brand, String model, int power, int screenSize) {
        super(brand, model, power);
        this.screenSize = screenSize;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                ", размер экрана: " +
                screenSize + " дюймов";
    }

    @Override
    public String getStatus() {
        return "Телевизор " + (super.isOn() ? "включен" : "выключен");
    }
}
