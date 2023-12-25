using OrderProcessing;
namespace HR;
public class CRMHistory : ICustomerDetails,IorderDetails{
    public void ShowCustomerDetails()
    {
        Console.WriteLine("showing customer details");
    }
    public void ShowOrderDetails()
    {
        Console.WriteLine("Showing Order Details");
    }
    public void ChangeProfile()
    {
        Console.WriteLine("Changing profile option is available");
    }
     void ICustomerDetails.ShowDetails()
    {
        Console.WriteLine("Showing Details of customer");
    }
    void IorderDetails.ShowDetails()
    {
        Console.WriteLine("Showing Details of order...");
    }
}