package managers;

import models.Animal;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalManager {
    private ArrayList<Animal> animalList = new ArrayList<>();

    public void addAnimal(Scanner scanner) {
        int id = animalList.size() + 1;

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter type (cow/sheep/goat/...): ");
        String type = scanner.nextLine();

        System.out.print("Enter health status: ");
        String healthStatus = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter status (for sale / kept): ");
        String status = scanner.nextLine();

        Animal animal = new Animal(id, name, type, healthStatus, price, status);
        animalList.add(animal);
        System.out.println("Animal #" + id + " added successfully!");
    }

    public void removeAnimal(Scanner scanner) {
        System.out.print("Enter animal ID to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Animal animal : animalList) {
            if (animal.getId() == id) {
                animalList.remove(animal);
                System.out.println("Animal #" + id + " removed successfully!");
                return;
            }
        }
        System.out.println("Animal not found!");
    }

    public void searchAnimal(Scanner scanner) {
        System.out.print("Enter animal ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Animal animal : animalList) {
            if (animal.getId() == id) {
                animal.displayInfo();
                return;
            }
        }
        System.out.println("Animal not found!");
    }

    public void displayAll() {
        if (animalList.isEmpty()) {
            System.out.println("No animals found!");
            return;
        }
        System.out.println("=== Animal List (" + animalList.size() + ") ===");
        for (Animal animal : animalList) {
            animal.displayInfo();
        }
    }

    public void displayAnimalTypes() {
        if (animalList.isEmpty()) {
            System.out.println("No animals found!");
            return;
        }

        ArrayList<String> types = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!types.contains(animal.getType())) {
                types.add(animal.getType());
            }
        }

        System.out.println("=== Animal Types ===");
        for (String type : types) {
            int count = 0;
            for (Animal animal : animalList) {
                if (animal.getType().equals(type)) count++;
            }
            System.out.println(type + " : " + count);
        }
    }

    public ArrayList<Animal> getAnimalList() { return animalList; }
}
