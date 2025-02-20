package by.donin.L2025_02_13_ext;

import java.util.Random;

public abstract class Pet extends Animal {

    private Owner owner;

    public Pet(String name, String species, int age) {
        super(name, species, age);
        //this.masterName = masterName;
        //this.masterSurName = surNames[random.nextInt(surNames.length)];
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
                " (Домашнее животное, хозяин: " + getOwnerName() + ")";
    }

    public void play() {
        System.out.println(getName() + " играет с хозяином " + getOwnerName());
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getOwnerName() {
        if (owner != null) {
            String name = owner.getSurName() + " " + owner.getName();
            return name;
        } else return "Без владельца";
    }

}
