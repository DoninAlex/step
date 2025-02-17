package by.donin.L2025_01_27;

import java.util.Random;

public class Psychiatrist {
    Random random = new Random();
    public boolean test(Recruit recruit) {
        if (random.nextInt(2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
