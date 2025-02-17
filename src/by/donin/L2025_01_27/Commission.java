package by.donin.L2025_01_27;

import java.util.Arrays;
import java.util.Random;

public class Commission {
    String[] doctors = {"Иванов", "Петров", "Сидоров", "Грибков", "Растеряев", "Глазко", "Шкет"};
    boolean valid = false;
    Dentist dentist;
    Oculist oculist;
    Surgeon surgeon;
    Psychiatrist psychiatrist;
    Therapist therapist;

    public Commission() {
        int specNumber = 5;
        if (specNumber <= doctors.length) {
            int[] staff = new int[specNumber];
            int ind = 0;
            int doc;
            Arrays.fill(staff, 1);
            Random random = new Random();
            while (ind < specNumber) {
                doc = random.nextInt(doctors.length);
                if (Arrays.binarySearch(staff, doc) < 0) {
                    staff[ind] = doc;
                    ind++;
                }
            }
            dentist = new Dentist();
            oculist = new Oculist();
            surgeon = new Surgeon();
            psychiatrist = new Psychiatrist();
            therapist = new Therapist();

            System.out.println("Члены комиссии:");
            for (int i = 0; i < staff.length; i++) {
                System.out.println((i + 1) + ". " + doctors[staff[i]]);
            }
            this.valid =  true;
        } else {
            this.valid =  false;
        }
    }

    public void test(Recruit recruit) {
        if (!dentist.test(recruit)) {
            String diagn = recruit.diagnosis;
            diagn += (diagn != "") ? ", " : "";
            diagn += "Множество зубных протезов";
            recruit.diagnosis = diagn;
            recruit.valid = false;
        }
        if (!oculist.test(recruit)) {
            String diagn = recruit.diagnosis;
            diagn += (diagn != "") ? ", " : "";
            diagn += "Плохое зрение";
            recruit.diagnosis = diagn;
            recruit.valid = false;
        }
        if (!surgeon.test(recruit)) {
            String diagn = recruit.diagnosis;
            diagn += (diagn != "") ? ", " : "";
            diagn += "Плоскостопие";
            recruit.diagnosis = diagn;
            recruit.valid = false;
        }
        if (!psychiatrist.test(recruit)) {
            String diagn = recruit.diagnosis;
            diagn += (diagn != "") ? ", " : "";
            diagn += "Шизофрения";
            recruit.diagnosis = diagn;
            recruit.valid = false;
        }
        if (!therapist.test(recruit)) {
            String diagn = recruit.diagnosis;
            diagn += (diagn != "") ? ", " : "";
            diagn += "Пульс не в норме";
            recruit.diagnosis = diagn;
            recruit.valid = false;
        }

        /*System.out.println("/// Dentist: " + dentist.test(recruit));
        System.out.println("/// Oculist: " + oculist.test(recruit));
        System.out.println("/// Surgeon: " + surgeon.test(recruit));
        System.out.println("/// Psychiatrist: " + psychiatrist.test(recruit));
        System.out.println("/// Therapist: " + therapist.test(recruit));*/

        //System.out.println("/// COM > Result: " + recruit.toString());
    }
}
