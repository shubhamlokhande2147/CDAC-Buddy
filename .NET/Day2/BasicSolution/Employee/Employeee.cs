namespace HR;
public class Employee
{
    private int id;
    public int Id
    {
        get { return this.id; }
        set { this.id = value; }
    }
    public string Fullname
    {
        get; set;
    }
    public Employee() : this(1, "Harsh Wadavane")
    {

    }
    public Employee(int id, string fullname)
    {
        this.id = id;
        this.Fullname = fullname;
    }
    
    public override string ToString()
    {
        return this.id + " " + this.Fullname;
    }

    //calculate salary
     public virtual float calculatesal()
    {
        return 45000;
    }

}