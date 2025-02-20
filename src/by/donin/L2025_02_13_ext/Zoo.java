package by.donin.L2025_02_13_ext;

public class Zoo {
    public static void main(String[] args) {
        Owner owner1 = new Owner();
        Owner owner2 = new Owner();
        Animal dog1 = new Dog("Барсик", "Собака", 3);
        Animal cat1 = new Cat("Мурка", "Кот", 2);
        Animal dog2 = new Dog("Бобик", "Собака", 2);
        Animal cat2 = new Cat("Котя", "Кот", 4);
        Animal bird = new Bird("Кеша", "Птица", 1, "Тропический лес");
        Animal lion = new Lion("Симба", "Лев", 5, "Африканская саванна");

        Animal[] animals = {dog1, cat1, dog2, cat2, bird, lion};

        owner1.addPet((Pet)cat1);
        //owner1.addPet((Pet)cat2);
        owner2.addPet((Pet)dog1);
        owner2.addPet((Pet)dog2);

        for(Animal animal : animals) {
            System.out.println(animal);
            animal.makeSound();
            animal.move();
            animal.eat();
            if(animal instanceof Pet pet) {
                pet.play();
            }
            if(animal instanceof WildAnimal wild) {
                wild.hunt();
            }
            System.out.println();
        }
        System.out.println("Общее количество животных: " + Animal.getTotalAnimals());
        System.out.println("Общее количество владельцев: " + Owner.getTotalOwners());
    }
}
