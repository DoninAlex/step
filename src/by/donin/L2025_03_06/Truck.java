package by.donin.L2025_03_06;

public class Truck extends Transport{
    private int loadCapacity;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Грузовик, " + super.toString();
    }
}
