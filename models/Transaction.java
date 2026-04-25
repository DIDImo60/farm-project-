package models;

import java.time.LocalDate;

public class Transaction {
    private int transactionId;
    private int animalId;
    private String type;
    private double price;
    private LocalDate date;
    private String buyerOrSeller;

    public Transaction(int transactionId, int animalId, String type, double price, String buyerOrSeller) {
        this.transactionId = transactionId;
        this.animalId = animalId;
        this.type = type;
        this.price = price;
        this.date = LocalDate.now();
        this.buyerOrSeller = buyerOrSeller;
    }

    public int getTransactionId() { return transactionId; }
    public int getAnimalId() { return animalId; }
    public String getType() { return type; }
    public double getPrice() { return price; }
    public LocalDate getDate() { return date; }
    public String getBuyerOrSeller() { return buyerOrSeller; }

    public void displayInfo() {
        System.out.println("---------------------------");
        System.out.println("Transaction ID   : " + transactionId);
        System.out.println("Animal ID        : " + animalId);
        System.out.println("Type             : " + type);
        System.out.println("Price            : " + price);
        System.out.println("Date             : " + date);
        System.out.println("Buyer/Seller     : " + buyerOrSeller);
        System.out.println("---------------------------");
    }
}
