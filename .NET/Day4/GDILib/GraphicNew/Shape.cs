namespace AWT.Draw;

public abstract class Shape{

public string Color{get;set;}
public int Width{get;set;}

public Shape()
{
    this.Color = " Black";
    this.Width = 2;
}
 
 
public Shape(int w,string c)
{
    this.Width = w;
    this.Color = c;
}

 public override string ToString()
 {
    return "Color : " + this.Color + "Width : " + this.Width;
 }

 public abstract void Draw();

}