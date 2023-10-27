
import java.util.Scanner;

public class PersonService {
	
	static Person[] parr;
	static int cnt;

	static 
	{
	  parr=new Person[100];	
    	
	    parr[0] = new Person(1,"shubham","1212122147");
	    parr[1] = new Person(2,"harshu","1454542147");
    	parr[2] = new Person(3,"harsh","4554122147");
    	cnt=3;
	}
	
	public static void addNewPerson()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		
		System.out.println("Enter name");
		String name = sc.next();
		
		System.out.println("Enter mobile");
		String mobile= sc.next();
		
		parr[cnt]=new Person(id,name,mobile);
		cnt++;
		
	}
	
	
	
	public static void displayAll()
	{
		for(int i=0;i<cnt;i++)
		{
			System.out.println(parr[i]);
		
		}
	}
	
	
	public static Person searchById(int id)
	{
		for(int i=0;i<cnt;i++)
		{
			if(parr[i].getpid()==id)
			{
				return parr[i];
			}
		}
		return null;
	}
	
	
	
	public static Person[] getByName(String nm) {
		//assumption maximum 10 perople will be ther with same name, other wise create array of size 100
		Person[] arr=new Person[10];
		int count=0;
		for(int i=0;i<cnt;i++) {
			if(parr[i].getpname().equals(nm)) {
				System.out.println("in if"+i);
				arr[count]=parr[i];
			    count++;
			}
		}
		if(cnt>0) {
			return arr;
	    }
		return null;
	}
	
	
	public static void updateMobByID(int id,String mobile)
	{
		  for(int i=0;i<cnt;i++)
		  {
			  if(parr[i].getpid()==id)
			  {
				  parr[i].setmobile(mobile);
				  System.out.println("Update Successfully..!");
			  }
		  }
	}
	
}
