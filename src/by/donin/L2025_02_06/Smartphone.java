package by.donin.L2025_02_06;

public class Smartphone extends ElectronicDevice {
    private double cameraResolution;

    public Smartphone(String brand, String model, int power, double cameraResolution) {
        super(brand, model, power);
        this.cameraResolution = cameraResolution;
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
                ", разрешение камеры: " +
                cameraResolution +
                " мегапикселей";
    }

    @Override
    public String getStatus() {
        return "Смартфон " + (super.isOn() ? "включен" : "выключен");
    }
}
