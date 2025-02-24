package by.donin.L2025_02_13_ext;

import java.util.Random;

public class PetFactory {
    private static Random random = new Random();
    private static String[] catNames = new String[5];
    private static String[] dogNames = new String[5];

    static {
        catNames[0] = "Мурка";
        catNames[1] = "Киса";
        catNames[2] = "Мурлыка";
        catNames[3] = "Маркиза";
        catNames[4] = "Мурыся";

        dogNames[0] = "Барбос";
        dogNames[1] = "Бобик";
        dogNames[2] = "Полкан";
        dogNames[3] = "Трезор";
        dogNames[4] = "Рекс";
    }

    public PetFactory() {
    }

    public static Pet next() {
        if (random.nextInt(2) == 0) {
            return new Dog(dogNames[random.nextInt(dogNames.length)], "Собака", random.nextInt(15));
        } else {
            return new Cat(catNames[random.nextInt(catNames.length)], "Кот", random.nextInt(15));
        }
    }
}
