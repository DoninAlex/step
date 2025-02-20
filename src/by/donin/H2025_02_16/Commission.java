package by.donin.H2025_02_16;

import java.util.Arrays;
import java.util.Random;

public class Commission {
    private Doctor[] doctors = new Doctor[5]; // Члены комиссии
    private Dentist dentist;
    private Oculist oculist;
    private Surgeon surgeon;
    private Psychiatrist psychiatrist;
    private Therapist therapist;

    public Commission() {

        Doctor dentist = new Dentist();
        Doctor oculist = new Oculist();
        Doctor surgeon = new Surgeon();
        Doctor psychiatrist = new Psychiatrist();
        Doctor therapist = new Therapist();

        //Doctor[] doctors = {dentist, oculist, surgeon, psychiatrist, therapist};
        doctors[0] = dentist;
        doctors[1] = oculist;
        doctors[2] = surgeon;
        doctors[3] = psychiatrist;
        doctors[4] = therapist;

            System.out.println("------------- Члены комиссии: -------------");
            for (Doctor doc : doctors) {
                System.out.println(doc.toString());
            }

    }

    public void test(Recruit recruit) {
/*        for (Doctor doc : doctors) {
            doc.test(recruit);
        }*/
        for (int i = 0; i < doctors.length; i++) {
            doctors[i].test(recruit);
        }

        if (recruit.isValid()) {
            ArrayRecruits.addValidRecruit(recruit);
        } else {
            ArrayRecruits.addNotValidRecruit(recruit);
        }

        /*System.out.println("/// Dentist: " + dentist.test(recruit));
        System.out.println("/// Oculist: " + oculist.test(recruit));
        System.out.println("/// Surgeon: " + surgeon.test(recruit));
        System.out.println("/// Psychiatrist: " + psychiatrist.test(recruit));
        System.out.println("/// Therapist: " + therapist.test(recruit));*/

        //System.out.println("/// COM > Result: " + recruit.toString());
    }
}
