package by.donin.L2025_02_06;

public class Laptop extends ElectronicDevice{
    private double hoursBatteryWork;

    public Laptop(String brand, String model, int power, double hoursBatteryWork) {
        super(brand, model, power);
        this.hoursBatteryWork = hoursBatteryWork;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                ", время работы от батареи - "
                + hoursBatteryWork + " ч.";
    }

    @Override
    public String getStatus() {
        return "Ноутбук " + (super.isOn() ? "включен" : "выключен");
    }
}
