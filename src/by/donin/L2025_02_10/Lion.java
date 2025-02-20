package by.donin.L2025_02_10;

public class Lion extends WildAnimal{
    public Lion(String name, String species, int age, String area) {
        super(name, species, age, area);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "  рычит: Ррррр!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " быстро бежит по саванне.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест мясо.");
    }


}
