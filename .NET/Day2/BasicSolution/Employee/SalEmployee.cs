namespace HR;

public class SalEmployee : WageEmployee
{

    public int Insentive { get; set; }
    public int Target { get; set; }

    //default constructor
    public static int cnt = 0;
    public SalEmployee() : this(3, "harsh", 100, 5670, 70000)
    {
        cnt++;
    }

    //para constructor
    public SalEmployee(int id, string fullname, int wrkinghours, int insentive, int target) : base(id, fullname, wrkinghours)
    {
        this.Insentive = insentive;
        this.Target = target;
        cnt++;
    }

    public override string ToString()
    {
        return base.ToString() +" "+ this.Insentive + " " + this.Target;
    }
    ~SalEmployee()
    {
        cnt--;
    }

        //calculate salary
     public override float calculatesal()
    {
        float totalSalary;
        if(Target >=70000)
        {
           totalSalary= base.calculatesal() + this.Insentive;
        }
        else
        {
            totalSalary = base.calculatesal();
        }
          return totalSalary;
    }
}
