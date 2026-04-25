package managers;

import models.Employee;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    private ArrayList<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Scanner scanner) {
        int id = employeeList.size() + 1;

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter role: ");
        String role = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();

        Employee emp = new Employee(id, name, age, role, salary, phone);
        employeeList.add(emp);
        System.out.println("Employee #" + id + " added successfully!");
    }

    public void removeEmployee(Scanner scanner) {
        System.out.print("Enter employee ID to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                employeeList.remove(emp);
                System.out.println("Employee #" + id + " removed successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public void searchEmployee(Scanner scanner) {
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                emp.displayInfo();
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public void displayAll() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees found!");
            return;
        }
        System.out.println("=== Employee List (" + employeeList.size() + ") ===");
        for (Employee emp : employeeList) {
            emp.displayInfo();
        }
    }
}
