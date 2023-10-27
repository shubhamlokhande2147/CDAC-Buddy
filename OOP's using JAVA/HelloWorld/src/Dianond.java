import java.util.Scanner;

public class Dianond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no. of rows :");
	int num=sc.nextInt();
	
	displayPattern(num);
	}



public static void displayPattern(int num)
{
//	int spacecount = (int)(num/2);
//	for(int i=1; i<=num;i=i+2)
//	{
//		String s=" ";
//		for(int k=0; k<spacecount;k++)
//		{
//			s= s+"-";
//		}
//		String star=" ";
//		for(int j=1;j<=i;j++)
//		{
//		  	star=star + "*";
//	    }
//		
//		System.out.println(s+star);
//		spacecount=spacecount-1;
//		System.out.println();
//	}
//	  
//	    spacecount=1;
//	    for(int i=num-2;i>=1;i=i-2)
//	    {
//	    	String s=" ";
//	    	for(int k=0; k<spacecount;k++)
//	    	{
//	    		s=s + "-";
//	    	}
//	    	String star=" ";
//	    	for(int j=0;j<i;j++)
//	    	{
//	    		star=star + "*";
//	    	}
//	    	System.out.println(s+star);
//	    	System.out.println();
//	    	spacecount=spacecount+1;
//	    }
	
	int spacecount = (int)(num/2);
	for(int i=2; i<=num;i=i+2)
	{
		String s=" ";
		for(int k=0; k<spacecount;k++)
		{
			s= s+"-";
		}
		String star=" ";
		for(int j=2;j<=i;j++)
		{
		  	star=star + "*";
	    }
		
		System.out.println(s+star);
		spacecount=spacecount-1;
		System.out.println();
	}
	  
	    spacecount=1;
	    for(int i=num-2;i>=2;i=i-2)
	    {
	    	String s=" ";
	    	for(int k=0; k<spacecount;k++)
	    	{
	    		s=s + "-";
	    	}
	    	String star=" ";
	    	for(int j=2;j<i;j++)
	    	{
	    		star=star + "*";
	    	}
	    	System.out.println(s+star);
	    	System.out.println();
	    	spacecount=spacecount+1;
	    }
	
}

}
