namespace HR;

public class SalesEmployee : WageEmployee{

   public int Insentive{get;set;}
   public int Target{get;set;}

   public SalesEmployee() : this(21,"Shiv","ABC","PQR",77,5000,450000)
   {

   } 

   public SalesEmployee(int ID, string Name, string Designation, string Department ,int hours,int Insentive,int Target) : base( ID,  Name, Designation, Department ,hours)
   {
      this.Insentive = Insentive;
      this.Target = Target;
   } 
}