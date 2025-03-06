package by.donin.L2025_03_06;

public class Bike extends Transport{
    private boolean hasSidecar;

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "Мотоцикл, " + super.toString();
    }
}
