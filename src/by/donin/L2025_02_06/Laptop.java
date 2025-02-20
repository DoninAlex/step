package by.donin.L2025_02_06;

public class Laptop extends ElectronicDevice{
    private double hoursBatteryWork;

    public Laptop(String brand, String model, int power, double hoursBatteryWork) {
        super(brand, model, power);
        this.hoursBatteryWork = hoursBatteryWork;
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("### Устройство " + getModel() + " от " + getBrand() + " включено.");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("### Устройство " + getModel() + " от " + getBrand() + " выключено.");
    }

    @Override
    public String getDescription() {
        return "[Устройство] " + getBrand() + " " + getModel() + ", мощность: " + getPower() + " Вт" +
                ", время работы от батареи - "
                + hoursBatteryWork + " ч.";
    }

    @Override
    public String getStatus() {
        return "Ноутбук " + (isOn() ? "включен" : "выключен");
    }


}
