package managers;

import models.Transaction;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionManager {
    private ArrayList<Transaction> transactionList = new ArrayList<>();

    public void addTransaction(Scanner scanner, Budget budget) {
        int id = transactionList.size() + 1;

        System.out.print("Enter animal ID: ");
        int animalId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Type (sale/purchase): ");
        String type = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter buyer/seller name: ");
        String buyerOrSeller = scanner.nextLine();

        Transaction transaction = new Transaction(id, animalId, type, price, buyerOrSeller);
        transactionList.add(transaction);

        if (type.equalsIgnoreCase("sale")) {
            budget.addIncome(price);
        } else {
            budget.addExpense(price);
        }

        System.out.println("Transaction #" + id + " added successfully!");
    }

    public void displayAll() {
        if (transactionList.isEmpty()) {
            System.out.println("No transactions found!");
            return;
        }
        System.out.println("=== Transaction List (" + transactionList.size() + ") ===");
        for (Transaction t : transactionList) {
            t.displayInfo();
        }
    }

    public void getTotalSales() {
        double total = 0;
        for (Transaction t : transactionList) {
            if (t.getType().equalsIgnoreCase("sale")) total += t.getPrice();
        }
        System.out.println("Total Sales : " + total);
    }

    public void getTotalPurchases() {
        double total = 0;
        for (Transaction t : transactionList) {
            if (t.getType().equalsIgnoreCase("purchase")) total += t.getPrice();
        }
        System.out.println("Total Purchases : " + total);
    }
}
