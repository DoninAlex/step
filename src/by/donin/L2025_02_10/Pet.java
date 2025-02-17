package by.donin.L2025_02_10;

public abstract class Pet extends Animal{
    private String masterName;

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public Pet(String name, String species, int age, String masterName) {
        super(name, species, age);
        this.masterName = masterName;
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
                " (Домашнее животное, хозяин: " + masterName + ")";
    }

    public void play() {
        System.out.println(getName() + " играет с хозяином " + masterName);
    }
}
