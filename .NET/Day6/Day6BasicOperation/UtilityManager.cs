namespace Utility;
using Mathsis;
public static class UtilityManager
{

    public static void Calculate(int radius, out float area, out float circum)
    {
        area = (3.142f) * radius * radius;
        circum = 2 * (3.142f) * radius;
    }
    public static void swap(ref int x,ref int y)
    {
        int temp = x;
        x=y;
        y=temp;
    }
    public static void ShowName(params object[] names)
    {
        foreach (object name in names)
        {
            Console.WriteLine(name);
        }
    }

    public static int Mul(this MathEngine e, int n1, int n2)
    {
        return n1 * n2;
    }
    public static int Div(this MathEngine e, int n1, int n2)
    {
        return n1 / n2;
    }


}