package by.donin.L2025_01_27;

public class Oculist {
    public boolean test(Recruit recruit) {
        if (recruit.visionCoeff >= 0.8 && recruit.visionCoeff <= 1.2) {
            return true;
        } else {
            return false;
        }
    }
}
