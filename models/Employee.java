package models;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String role;
    private double salary;
    private String phone;

    public Employee(int id, String name, int age, String role, double salary, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.role = role;
        this.salary = salary;
        this.phone = phone;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getRole() { return role; }
    public double getSalary() { return salary; }
    public String getPhone() { return phone; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setRole(String role) { this.role = role; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setPhone(String phone) { this.phone = phone; }

    public void displayInfo() {
        System.out.println("---------------------------");
        System.out.println("Employee ID : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Role        : " + role);
        System.out.println("Salary      : " + salary);
        System.out.println("Phone       : " + phone);
        System.out.println("---------------------------");
    }
}
