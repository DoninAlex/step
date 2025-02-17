package by.donin.L2025_01_27;

import java.util.Random;

public class RecruitGenerator {
    String[] firstNames = {"Павел", "Илья", "Василий", "Александр", "Геннадий", "Григорий"};
    String[] middleNames = {"Сергеевич", "Федорович", "Васильевич", "Александрович", "Геннадьевич", "Григорьевич"};
    String[] lastNames = {"Котиков", "Зайцев", "Печкин", "Албанов", "Петрушкин", "Следаков", "Пупкин", "Зубов"};
    //public ArrayRecruits arrayRecruits = new ArrayRecruits();
    public ArrayRecruits arrayRecruits;

    public RecruitGenerator(int recruitCount) {
        arrayRecruits = new ArrayRecruits(recruitCount);
    }

    public Recruit generate() {
        Random random = new Random();
        int id = this.arrayRecruits.getSize();
        Recruit recruit = new Recruit(
                id,
                firstNames[random.nextInt(firstNames.length)],
                middleNames[random.nextInt(middleNames.length)],
                lastNames[random.nextInt(lastNames.length)],
                true,
                "",
                random.nextDouble(2.0) + 0.5,
                random.nextBoolean(),
                random.nextInt(3),
                random.nextInt(160) + 40
        );
        //System.out.println("### GEN > " + recruit.toString());
        return recruit;
    }
}
