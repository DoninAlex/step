package by.donin.H2025_02_16;

public class Therapist extends Doctor {
    public Therapist() {
        super();
        setSpecialty("Терапевт");
    }

    public void test(Recruit recruit) {
        int cardiogram = recruit.getCardiogram();
        if (cardiogram < 60 || cardiogram > 100) {
            recruit.setValid(false);
            String diagn = recruit.getDiagnosis();
            diagn += (!diagn.equals("")) ? ", " : "";
            diagn += "Пульс не в норме";
            recruit.setDiagnosis(diagn);
        }
    }
}
