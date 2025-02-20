package by.donin.L2025_01_27;

public class Recruit {
    int id;
    String firstName;
    String middleName;
    String lastName;
    boolean valid;
    String diagnosis;
    double visionCoeff;
    boolean flatFeet;
    int implantCount;
    int cardiogram;

    public Recruit(
            int id,
            String firstName,
            String middleName,
            String lastName,
            boolean valid,
            String diagnosis,
            double visionCoeff,
            boolean flatFeet,
            int implantCount,
            int cardiogram
            ) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.valid = valid;
        this.diagnosis = diagnosis;
        this.visionCoeff = visionCoeff;
        this.flatFeet = flatFeet;
        this.implantCount = implantCount;
        this.cardiogram = cardiogram;
    }

    public String toString() {
        String out = "";
        out += "[" + id + "] " + lastName + " " + firstName + " " +
                 middleName + " -- " + (valid ? "годен" : "не годен (" + diagnosis + ")");
        return out;
    }
}
