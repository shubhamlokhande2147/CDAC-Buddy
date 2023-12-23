namespace banking;
using Taxation;
using Notification;
public class Account
{
// Console.WriteLine("----------------------------- Event --------------------------");
// //here,create event for TaxOperation and NotificationOperation
public event TaxOperation OverBalance;
public event NotificationOperation UnderBalance;
  
    public float Balance{get;set;}

    public void Deposit(float amount)
    {
        this.Balance = this.Balance + amount;
        if(this.Balance >= 250000)
        {
            this.Balance=this.Balance-5000;
            //fire event
            OverBalance(5000);
        }
    }
   
    public void Withdraw(float amount)
    { 
       this.Balance = this.Balance - amount;
       if(this.Balance <= 10000)
       {
        //fire event
         UnderBalance("Sourabh","Your Account is Blocked....");
       }
       
    }
}
