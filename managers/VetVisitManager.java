package managers;

import models.VetVisit;
import java.util.ArrayList;
import java.util.Scanner;

public class VetVisitManager {
    private ArrayList<VetVisit> visitList = new ArrayList<>();

    public void addVisit(Scanner scanner) {
        int visitId = visitList.size() + 1;

        System.out.print("Enter animal ID: ");
        int animalId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter diagnosis: ");
        String diagnosis = scanner.nextLine();

        System.out.print("Enter treatment: ");
        String treatment = scanner.nextLine();

        VetVisit visit = new VetVisit(visitId, animalId, diagnosis, treatment);
        visitList.add(visit);
        System.out.println("Visit #" + visitId + " added successfully!");
    }

    public void getLastVisit(Scanner scanner) {
        System.out.print("Enter animal ID: ");
        int animalId = scanner.nextInt();
        scanner.nextLine();

        VetVisit lastVisit = null;
        for (VetVisit visit : visitList) {
            if (visit.getAnimalId() == animalId) {
                lastVisit = visit;
            }
        }

        if (lastVisit != null) {
            System.out.println("=== Last Visit for Animal #" + animalId + " ===");
            lastVisit.displayInfo();
        } else {
            System.out.println("No visits found for this animal!");
        }
    }

    public void countAnimalsChecked() {
        ArrayList<Integer> checkedAnimals = new ArrayList<>();
        for (VetVisit visit : visitList) {
            if (!checkedAnimals.contains(visit.getAnimalId())) {
                checkedAnimals.add(visit.getAnimalId());
            }
        }
        System.out.println("Total animals checked : " + checkedAnimals.size());
        System.out.println("Total visits          : " + visitList.size());
    }

    public void displayAll() {
        if (visitList.isEmpty()) {
            System.out.println("No visits found!");
            return;
        }
        System.out.println("=== Vet Visit List (" + visitList.size() + ") ===");
        for (VetVisit visit : visitList) {
            visit.displayInfo();
        }
    }
}
