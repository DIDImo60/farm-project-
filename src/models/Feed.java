package models;

public class Feed {
    private int id;
    private String name;
    private String type;
    private double  quantity;
    private double price;
    
    //constructor
    public Feed(int id,String name,String type,double  quantity,double price){
        this.id = id;
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }
    
    //getters
    public int get_id(){return id;}
    public String get_name()        {return name;}
    public String get_type()        {return type;}
    public double get_quantity()    {return quantity;}
    public double get_price()       {return price;}
    
    //setters
    public void set_id(int id){this.id = id;}
    public void set_name(String name)           {this.name = name;}
    public void set_type(String type)           {this.type = type;}
    public void set_quantity(double  quantity)  {this.quantity = quantity;}
    public void set_price(double price)         {this.price = price;}

    //display informtion
    public void disp_info(){
        System.out.println("العلف id :" + id +"\n");
        System.out.println("اسم العلف :" + name +"\n");
        System.out.println("نوعه :" + type +"\n");
        System.out.println("كميته في النخزون :" + quantity +"\n");
        System.out.println("سعر كلغ : " + price +"\n");

    }
}
