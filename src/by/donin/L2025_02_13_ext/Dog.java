package by.donin.L2025_02_13_ext;

public class Dog extends Pet {

    public Dog(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Гав-гав!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " бегает на четырех лапах.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест собачий корм.");
    }


}
