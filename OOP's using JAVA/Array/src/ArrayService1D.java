
import java.util.Scanner;

public class ArrayService1D {

	public static void Accepttdata(int[] arr1)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array : ");
		for(int i=0; i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}
	}

	public static void Disptdata(int[] arr1)
	{
		System.out.println("Array : ");
		for(int i=0; i<arr1.length ; i++)
		{ 
			System.out.println(i +" = "+arr1[i]);
		}
	}
	
	public static void FindSum(int[] arr1)
	{
		int sum=0;
		for(int i=0; i<arr1.length ; i++)
		{
			sum =sum + arr1[i];
		}
		System.out.println("Sum of Arraay : "+sum);
	}
	
	public static void FindGreatVal(int[] arr1)
	{
		int count=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>count)
			{
				count=arr1[i];
			}
		}
		System.out.println("Max val : " +count);
	}
	
	public static int[] MaxVal(int[] arr1,int val)
	{
		int count=0;
		int[] temp = new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++)
		{ 
			if(arr1[i]>val)
			{
				temp[count]=arr1[i];
				count++;
			}
		}
		for(int i=count; i<arr1.length;i++)
		{
			temp[count]=-1;
			count++;
		}
		return temp;
	}

}
