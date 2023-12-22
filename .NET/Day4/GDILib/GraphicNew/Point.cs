namespace AWT.Draw;
public class Point{
    public int X{get;set;}
    public int Y{get;set;}
    public Point()
    {
        this.X=this.Y=0;
    }
    public Point(int x,int y)
    {
        this.X = x;
        this.Y = y;
    }
    public override String ToString()
    {
        string str = string.Format("x={0}, y={1}",this.X,this.Y);
        return str;
    }
}