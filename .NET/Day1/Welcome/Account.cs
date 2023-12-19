namespace bank;

public class Account{

    private double balance;
    private string name;

    public Account()
    {
        this.balance = 10000;
        this.name = "Shubham";
    }

    
    public Account(double bal,string nm)
    {
        this.balance = bal;
        this.name = nm;
    }

    public double getAmount()  //getter
    {
        return this.balance;
    }

    public void setAmount(double bal) //setter
    {
        this.balance = bal;
    }


     //property with getter and setter
     public string nam{
        get{return this.name;}
        set{this.name = value;}
    }
      
    public void Withdraw(double withamt)
    {
        if(balance == 0)
        {
            Console.WriteLine("Insufficient Balance");
        }
        else
        {
           this.balance = this.balance - withamt;
        }
    }


    public void Deposit(double depoamt)
    {
        if(balance == 0)
        {
            Console.WriteLine("Insufficient Balance");
        }
        else
        {
           this.balance = this.balance + depoamt;
        }
    }
 
    public override string ToString()
    {
        return this.name;
    } 
       
       public double getbalance()
       {
          return this.balance;
       }

}
