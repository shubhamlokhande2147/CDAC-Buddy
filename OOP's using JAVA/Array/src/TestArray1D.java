import java.util.Scanner;

public class TestArray1D {

	public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);		
		
		int[] arr1 = new int[10];
		 ArrayService1D.Accepttdata(arr1);
		 ArrayService1D.Disptdata(arr1);
	     ArrayService1D.FindSum(arr1);
	     ArrayService1D.FindGreatVal(arr1);
	     
	     int val=5;
	     int[] arr2=ArrayService1D.MaxVal(arr1,val);
		 ArrayService1D.Disptdata(arr2);


	}

}
