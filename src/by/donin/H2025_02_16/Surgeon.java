package by.donin.H2025_02_16;

public class Surgeon extends Doctor{

    public Surgeon() {
        super();
        setSpecialty("Ортопед");
    }

    public void test(Recruit recruit) {
        if (recruit.isFlatFeet()) {
            recruit.setValid(false);
            String diagn = recruit.getDiagnosis();
            diagn += (!diagn.equals("")) ? ", " : "";
            diagn += "Плоскостопие";
            recruit.setDiagnosis(diagn);
        }
    }
}
