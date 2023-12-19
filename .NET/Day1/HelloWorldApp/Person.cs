namespace HR;
public class Person{
    private int id;
    private String fname;
    private String lname;
    public Person()
    {
        this.id = 01;
        this.fname = "harsh";
        this.lname = "Wadavane";
    }
    public Person(int id,String fname,String lname)
    {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }
    ~Person()
    {

    }
    public void SetFName(String name)
    {
        this.fname = name;
    }
    public String getFName()
    {
        return fname;
    }
    public String Lname{
        get{
            return this.lname;
        }
        set{
            this.lname = value;
        }
    }
    public override string ToString()
    {
        return this.id+" "+this.fname + " "+ this.lname;
    }
}