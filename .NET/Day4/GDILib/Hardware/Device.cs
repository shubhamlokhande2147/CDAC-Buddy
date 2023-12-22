namespace Hardware;

//multiple interface implementation

public class CanonPrinter : IPrinter,IScanner
{

   public void Print()
   {
      Console.WriteLine("Just printer is Started....!");
   }

   public void Scan()
   {
      Console.WriteLine("Just scanner is Started....!");
   }
}