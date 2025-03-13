package by.donin.L2025_03_13;

import by.donin.L2025_02_27.User;
import by.donin.L2025_03_03.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserFactory {
    private List<User> users= new ArrayList<>();
    private static Random random = new Random();
    private static final List<String> names = List.of("Котиков", "Зайцев", "Печкин", "Албанов", "Петрушкин", "Следаков", "Пупкин", "Зубов");

    public static User getNext() {
        return new User(names.get(random.nextInt(names.size())),18 + random.nextInt(90));
    }
}
