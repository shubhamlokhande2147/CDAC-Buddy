using Hardware;
namespace AWT.Draw;

public class Circle : Shape,IPrinter{

    public Point Center{get;set;}
    public int Radius{get;set;}

   public Circle() : base()
   {
      this.Center = new Point(0,0);
      this.Radius = 2;
   }

  
   public Circle(Point c1,int r1,int w ,string clr) : base(w,clr)
   {
      this.Center = c1;
      this.Radius = r1;
   }


   public override string ToString()
   {
        const float pi= 3.14f;
        float area=pi*Radius*Radius;
     return base.ToString() + "Center : " + this.Center + "Radius : " + this.Radius + "Area : " + area; 
   }

   public override void Draw()
   {
     Console.WriteLine("Circle is Drawing.....");
     Console.WriteLine(this);
   }
   
   void IPrinter.Print()
   {
     Console.WriteLine("Circle is Printed...");
     Console.WriteLine(this);
   }
}