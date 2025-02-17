package by.donin.L2025_02_06;

public class Smartphone extends ElectronicDevice{
    private double cameraResolution;

    public Smartphone(String brand, String model, int power, double cameraResolution) {
        super(brand, model, power);
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                ", разрешение камеры: " +
                cameraResolution +
                " мегапикселей";
    }

    @Override
    public String getStatus() {
        return "Смартфон " + (super.isOn() ? "включен" : "выключен");
    }
}
