using Hardware;
namespace AWT.Draw;

public class Line:Shape,IPrinter{
    public Point Startpoint{get;set;}
    public Point Endpoint{get;set;}

    public Line():base()
    {
        this.Startpoint = new Point(0,0);
        this.Endpoint = new Point(0,0);
    }
    public Line(Point p1, Point p2,int w, String c):base(w,c)
    {
        this.Startpoint = p1;
        this.Endpoint = p2;
    }
    public override String ToString(){
        return base.ToString()+" "+this.Startpoint+" "+this.Endpoint;
    }

    public override void Draw()
    {
        Console.WriteLine("Drawing this");
        Console.WriteLine(this);
    }
    void IPrinter.Print()
    {
        Console.WriteLine("Printer is Drawing");
        Console.WriteLine(this);
    }
}