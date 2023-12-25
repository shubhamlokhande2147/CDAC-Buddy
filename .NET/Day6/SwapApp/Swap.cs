using System;

// This is the beginning of the Exercise5 class
public class Exercise5
{
    // This is the main method where the program execution starts
    public static void swap(int n1, int n2)
    {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
    public static void Main(string[] args)
    {
        // Console.WriteLine("Enter the num1 : ");
        // int n1 = int.Parse(Console.ReadLine());

        // Console.WriteLine("Enter the num2 : ");
        // int n2 = int.Parse(Console.ReadLine());
        int n1 = 10;
        int n2 = 90;
        Console.WriteLine("Before Swapping : ");
        Console.WriteLine("num1 : " + n1 + " num2 : " + n2);

        swap(n1, n2);
        Console.WriteLine("Before Swapping : ");
        Console.WriteLine("num1 : " + n1 + " num2 : " + n2);
    }
}
