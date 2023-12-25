using Utility;
using Mathsis;
using Book;
using stackDSA;


Console.WriteLine("using param keyword-----------");
UtilityManager.ShowName("venky", 12.5f, 5656, 0);
UtilityManager.ShowName("Venky", "Shubham", "Omker", "Vivek");
int radius = 6;
float area, circum;
UtilityManager.Calculate(radius, out area, out circum);
Console.WriteLine("Area: " + area);
Console.WriteLine("Circumference" + circum);
MathEngine obj = new MathEngine();
Console.WriteLine("Addition : " + obj.Addition(23, 23));
Console.WriteLine("Sub : " + obj.Sub(23, 23));
Console.WriteLine("Mul : " + obj.Mul(23, 23));
Console.WriteLine("Div : " + obj.Div(23, 23));


BookStore bs = new BookStore();
Console.WriteLine(bs[1]);
bs[3] = "The Ramayan";
Console.WriteLine(bs[3]);


Console.WriteLine("--------------Swap--------------");
int x = 10;
int y = 20;
Console.WriteLine("Before swap x=" + x + " y= " + y);
UtilityManager.swap(ref x, ref y);
Console.WriteLine("After swap x=" + x + " y= " + y);

Console.WriteLine("---------------------");

Stack st = new Stack(5);
// st.isNull();
// st.pop();
st.push(1);
st.push(2);
st.push(3);
st.push(4);
// st.push(5);
// st.isFull();
// st.push(52);
st.Print();
//st.clone();
Stack temp = (Stack)st.Clone();
temp.Print();
