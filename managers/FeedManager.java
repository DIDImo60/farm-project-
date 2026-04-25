package managers;

import models.Feed;
import java.util.ArrayList;
import java.util.Scanner;

public class FeedManager {
    private ArrayList<Feed> feedList = new ArrayList<>();

    public void addFeed(Scanner scanner) {
        int id = feedList.size() + 1;

        System.out.print("Enter feed name: ");
        String name = scanner.nextLine();

        System.out.print("Enter type: ");
        String type = scanner.nextLine();

        System.out.print("Enter quantity: ");
        double quantity = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter unit (kg/ton/...): ");
        String unit = scanner.nextLine();

        System.out.print("Enter minimum quantity for alert: ");
        double minQuantity = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Feed feed = new Feed(id, name, type, quantity, unit, minQuantity, price);
        feedList.add(feed);
        System.out.println("Feed #" + id + " added successfully!");
    }

    public void removeFeed(Scanner scanner) {
        System.out.print("Enter feed ID to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Feed feed : feedList) {
            if (feed.getId() == id) {
                feedList.remove(feed);
                System.out.println("Feed removed successfully!");
                return;
            }
        }
        System.out.println("Feed not found!");
    }

    public void updateQuantity(Scanner scanner) {
        System.out.print("Enter feed ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Feed feed : feedList) {
            if (feed.getId() == id) {
                System.out.print("Enter new quantity: ");
                double quantity = scanner.nextDouble();
                scanner.nextLine();
                feed.setQuantity(quantity);
                System.out.println("Quantity updated successfully!");
                return;
            }
        }
        System.out.println("Feed not found!");
    }

    public void checkLowStock() {
        System.out.println("=== Low Stock Feeds ===");
        boolean found = false;
        for (Feed feed : feedList) {
            if (feed.getQuantity() <= feed.getMinQuantity()) {
                feed.displayInfo();
                found = true;
            }
        }
        if (!found) System.out.println("All stocks are sufficient!");
    }

    public void displayAll() {
        if (feedList.isEmpty()) {
            System.out.println("No feeds found!");
            return;
        }
        System.out.println("=== Feed List (" + feedList.size() + ") ===");
        for (Feed feed : feedList) {
            feed.displayInfo();
        }
    }
}
