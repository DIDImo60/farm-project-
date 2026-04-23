package models;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String role;
    private double salary;
    private int phone;
    
    //constructor
    public Employee(int id,String name,int age,String role,double salary,int phone){
        this.id = id;
        this.name = name;
        this.age = age;
        this.role = role;
        this.salary = salary;
        this.phone = phone;
    }
    //getters
    public int get_id()         {return id;}
    public String get_name()    {return name;}
    public int get_age()        {return age;}
    public String role()        {return role;}
    public double get_salary()  {return salary;}
    public int get_phone()      {return phone;}
    
    //setters
    public void set_id(int id)          {this.id = id;}
    public void set_name(String name)   {this.name = name;}
    public void set_age(int age)        {this.age = age;}
    public void set_role(String role)   {this.role = role;}
    public void set_salary(double salary){this.salary = salary;}
    public void set_phone(int phone)    {this.phone = phone;}

    //display informtion
    public void disp_info(){
        System.out.println("الموظف id :" + id +"\n");
        System.out.println("اسم و لقب الموظف :" + name +"\n");
        System.out.println("عمره :" + age +"\n");
        System.out.println("عمله :" + role +"\n");
        System.out.println("راتبه :" + salary +"\n");
        System.out.println("رقم هاتفه :" + phone +"\n");
    }
}
