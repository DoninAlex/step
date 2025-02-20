package by.donin.H2025_02_16;

import java.util.Random;

public class Psychiatrist extends Doctor {
    Random random = new Random();

    public Psychiatrist() {
        super();
        setSpecialty("Психиатр");
    }

    public void test(Recruit recruit) {
        if (!random.nextBoolean()) {
            recruit.setValid(false);
            String diagn = recruit.getDiagnosis();
            diagn += (!diagn.equals("")) ? ", " : "";
            diagn += "Шизофрения";
            recruit.setDiagnosis(diagn);
        }
    }
}
