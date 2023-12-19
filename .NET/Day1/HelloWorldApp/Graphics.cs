namespace Graphic;
public struct Color
{
    private int r, g, b;
    public Color(int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
    }

   public override string ToString()
   {
      return this.r + " "+ this.g +" "+ this.b;
   }

}
