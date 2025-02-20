package by.donin.L2025_02_13_ext;

public class Zoo {
    public static void main(String[] args) {
        int ownerCount = 100;
        int petCount = 200;
        int animalIndex = 0;
        int ownerIndex = 0;
        Owner[] owners = new Owner[ownerCount];
        Animal[] animals = new Animal[ownerCount*petCount];

        for (int i = 0; i < ownerCount; i++) {
            Owner owner = OwnerFactory.next();
            for (int j = 0; j < petCount; j++) {
                Animal pet = PetFactory.next();
                animals[animalIndex++] = pet;
                owner.addPet((Pet)pet);
            }
            owners[ownerIndex] = owner;
        }


        //owner1.addPet((Pet)cat2);
        for(Owner owner : owners) {
            System.out.println(owner);

            System.out.println();
        }

        /*for(Animal animal : animals) {
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
        }*/
        System.out.println("Общее количество животных: " + Animal.getTotalAnimals());
        System.out.println("Общее количество владельцев: " + Owner.getTotalOwners());
    }
}
