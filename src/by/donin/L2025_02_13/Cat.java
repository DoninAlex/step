package by.donin.L2025_02_13;

public class Cat extends Pet {
    public Cat(String name, String species, int age, String masterName) {
        super(name, species, age, masterName);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Мяу!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " грациозно крадется.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест рыбу.");
    }

}
