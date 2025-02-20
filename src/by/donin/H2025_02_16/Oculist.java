package by.donin.H2025_02_16;

public class Oculist extends Doctor{
    public Oculist() {
        super();
        setSpecialty("Окулист");
    }

    public void test(Recruit recruit) {
        double visCoeff = recruit.getVisionCoeff();
        if (visCoeff < 0.8 || visCoeff > 1.2) {
            recruit.setValid(false);
            String diagn = recruit.getDiagnosis();
            diagn += (!diagn.equals("")) ? ", " : "";
            diagn += "Плохое зрение";
            recruit.setDiagnosis(diagn);
        }
    }
}
