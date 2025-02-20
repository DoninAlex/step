package by.donin.H2025_02_16;


public class Main {
    public static void main(String[] args) {
        //Recruit[] recruits = new Recruit[200];
        int recruitsValid = 0;
        int recruitsNotValid = 0;
        int recruitCount = 1000;
        //Recruit recruit1;
        //ArrayRecruits arrayRecruits;

        Commission commission = new Commission();


        ArrayRecruits arrayRecruits = new ArrayRecruits(recruitCount);
        for (int i = 0; i < recruitCount; i++) {
            arrayRecruits.add();
        }

        for (int i = 0; i < Recruit.getTotalRecruits(); i++) {
            commission.test(arrayRecruits.get(i));
        }

        System.out.println("------------ ГОДНЫ ------------");
        for (int i = 0; i < ArrayRecruits.getTotalValidRecruits(); i++) {
            Recruit recruit1 = ArrayRecruits.getValidRecruit(i);
            System.out.println((i + 1) + ". " + recruit1.toString());
        }

        System.out.println("------------ НЕ ГОДНЫ ------------");
        for (int i = 0; i < ArrayRecruits.getTotalNotValidRecruits(); i++) {
            Recruit recruit1 = ArrayRecruits.getNotValidRecruit(i);
            System.out.println((i + 1) + ". " + recruit1.toString());
        }

        System.out.println("------------------------------------");
        System.out.println("ИТОГО > годны: " + ArrayRecruits.getTotalValidRecruits() +
                ", не годны: " + ArrayRecruits.getTotalNotValidRecruits());

    }
}
