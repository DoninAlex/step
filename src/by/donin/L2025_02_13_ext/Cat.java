package by.donin.L2025_02_13_ext;

public class Cat extends Pet {
    public Cat(String name, String species, int age) {
        super(name, species, age);
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
