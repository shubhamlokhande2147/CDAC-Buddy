namespace HR;

public class WageEmployee : Employee{

   public int wrkinghours{get;set;}

   public WageEmployee() : this(2,"Venky-Monky",77)
   {

   } 

   public WageEmployee(int id, string fullname, int hours) : base(id,fullname)
   {
      this.wrkinghours = hours;
   } 

   public override string ToString()
   {
     return base.ToString() + " " + this.wrkinghours;
   }


    //calculate salary
     public override float calculatesal()
    {
        return base.calculatesal() + wrkinghours * 500;
    }

}

