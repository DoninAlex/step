package by.donin.L2025_01_27;


public class Main {
    public static void main(String[] args) {
        //Recruit[] recruits = new Recruit[200];
        int recruitsValid = 0;
        int recruitsNotValid = 0;
        int recruitCount = 1000;
        Recruit recruit1;
        //ArrayRecruits arrayRecruits;

        Commission commission = new Commission();
        if (commission.valid) {

            //arrayRecruits = new ArrayRecruits();
            RecruitGenerator recruitGenerator = new RecruitGenerator(recruitCount);
            for (int i = 0; i < recruitCount; i++) {
                //recruit1 = recruitGenerator.generate();
                recruitGenerator.arrayRecruits.add(recruitGenerator.generate());
            }

            for (int i = 0; i < recruitCount; i++) {
                commission.test(recruitGenerator.arrayRecruits.recruits[i]);
                //arrayRecruits.add(recruitGenerator.generate());
            }
            //System.out.println(recruitGenerator.arrayRecruits.toString());

            System.out.println("------------ ГОДНЫ ------------");
            for (int i = 0; i < recruitCount; i++) {
                recruit1 = recruitGenerator.arrayRecruits.recruits[i];
                if (recruit1.valid) {
                    System.out.println(++recruitsValid + ". " + recruit1.toString());
                }
            }

            System.out.println("------------ НЕ ГОДНЫ ------------");
            for (int i = 0; i < recruitCount; i++) {
                recruit1 = recruitGenerator.arrayRecruits.recruits[i];
                if (!recruit1.valid) {
                    System.out.println(++recruitsNotValid + ". " + recruit1.toString());
                }
            }

            System.out.println("------------------------------------");
            System.out.println("ИТОГО > годны: " + recruitsValid +
                    ", не годны: " + recruitsNotValid);
        }
    }
}
