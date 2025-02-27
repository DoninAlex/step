package by.donin.L2025_02_27;

public class Task00 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User("Дима", 17);
        User user2 = new User("Дима", 17);
        System.out.println("user2.equals(user1) > " + user2.equals(user1));
        System.out.println("user2 == user1 > " + (user2 == user1));
        Object user3 = new User("Вася", 34); // Полиморфизм
        Object users = new User[3];
        User user4 = (User) user3; // Приведение типов

        System.out.println("user2.hashCode() > " + user2.hashCode());
        System.out.println("user1.hashCode() > " + user1.hashCode());

        User user5 = user1.clone();
    }
}
