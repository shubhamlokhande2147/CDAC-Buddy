namespace HR;

public class WageEmployee : Employee{

   public int wrkinghours{get;set;}

   public WageEmployee() : this(21,"Shiv","ABC","PQR",77)
   {

   } 

   public WageEmployee(int ID, string Name, string Designation, string Department ,int hours) : base(ID,Name,Designation,Department)
   {
      this.wrkinghours = hours;
   } 
}