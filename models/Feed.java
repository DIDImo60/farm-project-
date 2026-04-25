package models;

public class Feed {
    private int id;
    private String name;
    private String type;
    private double quantity;
    private String unit;
    private double minQuantity;
    private double price;

    public Feed(int id, String name, String type, double quantity, String unit, double minQuantity, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.unit = unit;
        this.minQuantity = minQuantity;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getType() { return type; }
    public double getQuantity() { return quantity; }
    public String getUnit() { return unit; }
    public double getMinQuantity() { return minQuantity; }
    public double getPrice() { return price; }

    public void setQuantity(double quantity) { this.quantity = quantity; }
    public void setPrice(double price) { this.price = price; }
    public void setName(String name) { this.name = name; }

    public void displayInfo() {
        System.out.println("---------------------------");
        System.out.println("Feed ID      : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Type         : " + type);
        System.out.println("Quantity     : " + quantity + " " + unit);
        System.out.println("Min Quantity : " + minQuantity);
        System.out.println("Price        : " + price);
        System.out.println("---------------------------");
    }
}
