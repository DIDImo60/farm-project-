import managers.*;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static EmployeeManager employeeManager = new EmployeeManager();
    static AnimalManager animalManager = new AnimalManager();
    static VetVisitManager vetVisitManager = new VetVisitManager();
    static FeedManager feedManager = new FeedManager();
    static Budget budget = new Budget();
    static TransactionManager transactionManager = new TransactionManager();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n====== Livestock Farm Management System ======");
            System.out.println("1. Employee Management");
            System.out.println("2. Animal Management");
            System.out.println("3. Vet Visits");
            System.out.println("4. Feed Stock");
            System.out.println("5. Buy & Sell");
            System.out.println("6. Budget");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: employeeMenu(); break;
                case 2: animalMenu(); break;
                case 3: vetMenu(); break;
                case 4: feedMenu(); break;
                case 5: transactionMenu(); break;
                case 6: budget.getBalance(); break;
                case 0: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    static void employeeMenu() {
        int choice;
        do {
            System.out.println("\n== Employee Management ==");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Display All Employees");
            System.out.println("0. Back");
            System.out.print("Choose: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: employeeManager.addEmployee(scanner); break;
                case 2: employeeManager.removeEmployee(scanner); break;
                case 3: employeeManager.searchEmployee(scanner); break;
                case 4: employeeManager.displayAll(); break;
                case 0: break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    static void animalMenu() {
        int choice;
        do {
            System.out.println("\n== Animal Management ==");
            System.out.println("1. Add Animal");
            System.out.println("2. Remove Animal");
            System.out.println("3. Search Animal");
            System.out.println("4. Display All Animals");
            System.out.println("5. Display Animal Types");
            System.out.println("0. Back");
            System.out.print("Choose: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: animalManager.addAnimal(scanner); break;
                case 2: animalManager.removeAnimal(scanner); break;
                case 3: animalManager.searchAnimal(scanner); break;
                case 4: animalManager.displayAll(); break;
                case 5: animalManager.displayAnimalTypes(); break;
                case 0: break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    static void vetMenu() {
        int choice;
        do {
            System.out.println("\n== Vet Visits ==");
            System.out.println("1. Add Visit");
            System.out.println("2. Last Visit for Animal");
            System.out.println("3. Visit Statistics");
            System.out.println("4. Display All Visits");
            System.out.println("0. Back");
            System.out.print("Choose: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: vetVisitManager.addVisit(scanner); break;
                case 2: vetVisitManager.getLastVisit(scanner); break;
                case 3: vetVisitManager.countAnimalsChecked(); break;
                case 4: vetVisitManager.displayAll(); break;
                case 0: break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    static void feedMenu() {
        int choice;
        do {
            System.out.println("\n== Feed Stock ==");
            System.out.println("1. Add Feed");
            System.out.println("2. Remove Feed");
            System.out.println("3. Update Feed Quantity");
            System.out.println("4. Check Low Stock");
            System.out.println("5. Display All Feeds");
            System.out.println("0. Back");
            System.out.print("Choose: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: feedManager.addFeed(scanner); break;
                case 2: feedManager.removeFeed(scanner); break;
                case 3: feedManager.updateQuantity(scanner); break;
                case 4: feedManager.checkLowStock(); break;
                case 5: feedManager.displayAll(); break;
                case 0: break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    static void transactionMenu() {
        int choice;
        do {
            System.out.println("\n== Buy & Sell ==");
            System.out.println("1. Add Transaction");
            System.out.println("2. Display All Transactions");
            System.out.println("3. Total Sales");
            System.out.println("4. Total Purchases");
            System.out.println("0. Back");
            System.out.print("Choose: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: transactionManager.addTransaction(scanner, budget); break;
                case 2: transactionManager.displayAll(); break;
                case 3: transactionManager.getTotalSales(); break;
                case 4: transactionManager.getTotalPurchases(); break;
                case 0: break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}
