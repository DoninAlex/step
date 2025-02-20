package by.donin.L2025_02_13_ext;

public class Bird extends WildAnimal {
    public Bird(String name, String species, int age, String area) {
        super(name, species, age, area);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " чирикает: Чик-Чирик!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " летает в небе.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " клюет зерна.");
    }


}
