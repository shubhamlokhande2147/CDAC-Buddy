
import java.util.*;
import java.util.Scanner;
public class ArrayOpeartion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int [] arr1 =new int[5];
		int [] arr2=new int[5];
		int [] sum1=new int[5];

		int [][] arr3 = new int[3][3];
		int [][] temp = new int[3][3];
		int choice;

		do {
			System.out.println("\n1.Add two array\n2.Tranpose of array\n3.Minimum no. of array \n4.Maximum no. of array \n5.Get frequency of element in 2d array\n6.exit");
			System.out.println("\nPlease enter your choice : ");
			choice = sc.nextInt(); 

			switch(choice)
			{
			case 1 : 
				System.out.println("Enter First Array");
				AdditionOfArray.getArray(arr1);
				System.out.println("Enter Second Array");
				AdditionOfArray.getArray(arr2);

				System.out.println("Addition of two array is ");
				sum1=AdditionOfArray.Addition(arr1, arr2);
				AdditionOfArray.dispArray(sum1);
				break;

			case 2 :       
				System.out.println("Enter 2D Array");
				AdditionOfArray.getArray2D(arr3);

				System.out.println("Given Matrix : ");
				AdditionOfArray.dispArray2D(arr3);

				temp = AdditionOfArray.tranposeArray2D(arr3);
				System.out.println("Transpose of Matrix : ");
				AdditionOfArray.dispArray2D(temp);
				break;

			case 3 :
				System.out.println("Enter 2D Array");
				AdditionOfArray.getArray2D(arr3);

				int min=AdditionOfArray.MinimumElementInArray2D(arr3);
				System.out.println("Minimum element is "+(min));
				break;
			case 4 :
				System.out.println("Enter First 2D Array");
				AdditionOfArray.getArray2D(arr3);

				int max=AdditionOfArray.MaximumElementInArray2D(arr3);
				System.out.println("Maximum element is "+(max));
				break;

			case 5 :
				System.out.println("Enter First 2D Array");
				AdditionOfArray.getArray2D(arr3);
				System.out.println("Pleasec enter value you want to frequency :");
				int val;
				val = sc.nextInt();
				int count=AdditionOfArray.GetFrequency(arr3,val);
				System.out.println((val) +" element occurs at "+(count) +" times.");
				break;

			case 6 : 
				System.out.println("Exit");
				System.exit(0); 
				break;
			}

		}while(choice!=0); 
		sc.close();
	}

}
