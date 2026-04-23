package models;

public class Animal {
    
    private int id;
    private String name;
    private String type;
    private String healthStatus;
    private double price;
    private String status;
    
    //constructor
    public Animal(int id,String name,String type,String healthStatus,double price,String status){
        this.id = id;
        this.name = name;
        this.type = type;
        this.healthStatus = healthStatus;
        this.price = price;
        this.status = status;
    }
    //getters
    public int get_id()             {return id;}
    public String get_name()        {return name;}
    public String get_type()        {return type;}
    public String get_healthStatus(){return healthStatus;}
    public double get_price()       {return price;}
    public String get_status()      {return status;}
    
    //setters
    public void set_id(int id)                          {this.id = id;}
    public void set_name(String name)                   {this.name = name;}
    public void set_type(String type)                   {this.type = type;}
    public void set_healthStatus(String healthStatus)   {this.healthStatus = healthStatus;}
    public void set_price(double price)                 {this.price = price;}
    public void set_status(String status)               {this.status = status;}

    //display informtion
    public void disp_info(){
        System.out.println("الحيوان id :" + id +"\n");
        System.out.println("نوعه :" + type +"\n");
        System.out.println("اسم الحيوان :" + name +"\n");
        System.out.println("حالته الصحي :" + healthStatus +"\n");
        System.out.println("حالته :" + status +"\n");
        System.out.println("سعره :" + price +"\n");
    }
}
