import java.util.Scanner;

public class CmdLineAdd4 {
	
	public static void main(String [] args)
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the first no. : ");
        int num1=sc.nextInt();
        System.out.println("enter the second number no. : ");
		int num2=sc.nextInt();
		
		int ans = addition(num1,num2);
		System.out.println("Addition : "+ans);
		
		int ans1=add_digit(num1);
		System.out.println("Addition of digits : "+ans1);
		
		
	}
	
	
	public static int addition(int num1,int num2)
	{
		return num1 + num2;
	}
	
	public static int add_digit(int num1)
	{
		int s=0;
		while(num1 != 0)
		{
			int d = num1 % 10;
			s = s + d;
			(num1) = (int)(num1/10);
		}
		
		return s;
	}

}
