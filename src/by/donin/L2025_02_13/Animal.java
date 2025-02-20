package by.donin.L2025_02_13;

public abstract class Animal {

    private int id; // Уникальный идентификатор
    private String name;
    private String species;
    private int age;

    private static int totalAnimals = 0; // Общий счётчик животных

    public Animal(String name, String species, int age) {
        this.id = ++totalAnimals;
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public abstract void makeSound();

    public abstract void move();

    public abstract void eat();

    public String toString() {
        return "[" + id + "] " + species + " по имени " + name +
                ", возраст: " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }
}
