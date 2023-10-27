import java.util.*;
public class AdditionOfArray {

	public static void getArray(int[] arr)
	{	
		Scanner sc =new Scanner(System.in);
		//System.out.println("Enter Array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
	}


	public static void dispArray(int[] arr)
	{	

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("postion "+(i)+" has element "+(arr[i]));
		}
	}


	public static int [] Addition(int[] arr1,int[] arr2)
	{
		int [] temp=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			temp[i]=arr1[i]+arr2[i];
		}
		return temp;
	}


	public static void getArray2D(int[][] arr)
	{
		Scanner sc =new Scanner(System.in);

		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt(); 
			}
		}
	}


	public static void dispArray2D(int[][] arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print((arr[i][j])+"\t"); 
			}
			System.out.println();
		} 
	}


	public static int[][] tranposeArray2D(int[][] arr)
	{
		int temp[][] = new int[arr.length][arr.length];

		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				temp[j][i] = arr[i][j];	              
			}
		} 
		return temp;

	}


	public static int MinimumElementInArray2D(int[][] arr)
	{
		int min=Integer.MAX_VALUE;
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(min>arr[i][j])
				{
					min=arr[i][j];
				}
			}
		} 
		return min;

	}


	public static int MaximumElementInArray2D(int[][] arr)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(max<arr[i][j])
				{
					max=arr[i][j];
				}
			}
		} 
		return max;

	}


	public static int GetFrequency(int[][] arr,int value)
	{
		int count=0;
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j]==value)
				{
					count++;
				}

			}
		} 
		return count;

	}

}
