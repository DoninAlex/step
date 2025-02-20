package by.donin.L2025_02_13;

public class Zoo {
    public static void main(String[] args) {
        Animal dog = new Dog("Барсик", "Собака", 3, "Вася");
        Animal cat = new Cat("Мурка", "Кот", 2, "Катя");
        Animal bird = new Bird("Кеша", "Птица", 1, "Тропический лес");
        Animal lion = new Lion("Симба", "Лев", 5, "Африканская саванна");

        Animal[] animals = {dog, cat, bird, lion};

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
    }
}
