package by.donin.L2025_01_27;

public class Therapist {
    public boolean test(Recruit recruit) {
        if (recruit.cardiogram >= 60 || recruit.cardiogram <= 100) {
            return true;
        } else {
            return false;
        }
    }
}
