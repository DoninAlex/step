package by.donin.L2025_02_13;

public abstract class WildAnimal extends Animal {
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public WildAnimal(String name, String species, int age, String area) {
        super(name, species, age);
        this.area = area;
    }

    @Override
    public abstract void makeSound();

    @Override
    public abstract void move();

    @Override
    public abstract void eat();

    @Override
    public String toString() {
        return super.toString() +
                " (Дикое животное, среда обитания: " + area + ")";
    }

    public void hunt() {
        System.out.println(getName() + " охотится в " + getArea());
    }
}
