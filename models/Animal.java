package models;

public class Animal {
    private int id;
    private String name;
    private String type;
    private String healthStatus;
    private double price;
    private String status;

    public Animal(int id, String name, String type, String healthStatus, double price, String status) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.healthStatus = healthStatus;
        this.price = price;
        this.status = status;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getType() { return type; }
    public String getHealthStatus() { return healthStatus; }
    public double getPrice() { return price; }
    public String getStatus() { return status; }

    public void setName(String name) { this.name = name; }
    public void setType(String type) { this.type = type; }
    public void setHealthStatus(String healthStatus) { this.healthStatus = healthStatus; }
    public void setPrice(double price) { this.price = price; }
    public void setStatus(String status) { this.status = status; }

    public void displayInfo() {
        System.out.println("---------------------------");
        System.out.println("Animal ID     : " + id);
        System.out.println("Name          : " + name);
        System.out.println("Type          : " + type);
        System.out.println("Health Status : " + healthStatus);
        System.out.println("Price         : " + price);
        System.out.println("Status        : " + status);
        System.out.println("---------------------------");
    }
}
