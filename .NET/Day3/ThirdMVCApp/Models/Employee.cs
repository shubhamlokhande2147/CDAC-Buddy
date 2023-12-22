namespace HR;

public class Employee
{
   public int ID{get;set;}
   public string Name{get;set;} 
   public string Designation{get;set;}
   public string Department{get;set;}

    public Employee()
    {
        this.ID = 11;
        this.Name = "Shubham";
        this.Designation = "Lokhande";
        this.Department = "IT";
    }
    public Employee(int id,String name,String desi,string dept)
    {
        this.ID = id;
        this.Name = name;
        this.Designation = "desi";
        this.Department = "dept";  
    }
    ~Employee()
    {

    }
   
}