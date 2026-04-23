package models;
import java.time.LocalDate;


public class Transaction {
    private int         transactionId;
    private int         animalId;
    private String      type;
    private LocalDate   date;
    private double      price;
    private String      buyerOrSeller;

    //constructor
    public Transaction(int transactionId,int animalId,String type,double  price,String buyerOrSeller){
        this.transactionId = transactionId;
        this.animalId = animalId;
        this.type = type;
        this.price = price;
        this.buyerOrSeller = buyerOrSeller;
        this.date = LocalDate.now();
    }

    //getters
    public int      get_transactionId()     {return transactionId;}
    public int      get_animalId()          {return animalId;}
    public String   get_type()              {return type;}
    public LocalDate      get_date()              {return date;}
    public double   get_price()             {return price;}
    public String   get_buyerOrSeller()     {return buyerOrSeller;}
    
    //setters
    public void set_transactionId(int transactionId)    {this.transactionId = transactionId;}
    public void set_animalId(int animalId)              {this.animalId = animalId;}
    public void set_type(String type)                   {this.type = type;}
    public void set_date(String   date)                    {this.date = LocalDate.parse(date);}
    public void set_price(double price)                 {this.price = price;}
    public void set_buyerOrSeller(String buyerOrSeller) {this.buyerOrSeller = buyerOrSeller;}

    //display informtion
    public void disp_info(){
        System.out.println("رمز العمليه :" + transactionId +"\n");
        System.out.println("رمز الحيوان :" + animalId +"\n");
        System.out.println("نوع العملية :" + type +"\n");
        System.out.println("تاريخ العملية :" + date +"\n");
        System.out.println("سعر : " + price +"\n");

        if("buy".equals(type))          {System.out.println("البائع : " + buyerOrSeller +"\n");}
        else if("sell".equals(type))    {System.out.println("المشتري : " + buyerOrSeller +"\n");}
        

    }
}
