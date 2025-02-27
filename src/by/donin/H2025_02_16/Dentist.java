package by.donin.H2025_02_16;

public class Dentist extends Doctor{
    public Dentist() {
        super();
        super.setSpecialty("Дантист");
    }

    public void test(Recruit recruit) {
        int impl = recruit.getImplantCount();
        if (impl > 1) {
            recruit.setValid(false);
            String diagn = recruit.getDiagnosis();
            diagn += (!diagn.equals("")) ? ", " : "";
            diagn += "Множество зубных протезов";
            recruit.setDiagnosis(diagn);
        }
    }
}
