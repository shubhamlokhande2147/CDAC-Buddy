import java.util.*;
public class StudentService {
	static Student[] starr;
	static int cnt;
	static
	{
		starr=new Student[20];
		starr[0]=new Student(1,"harsh",100,100,100);
		starr[1]=new Student(2,"shubham",200,200,200);
		starr[2]=new Student(3,"omkar",20,20,20);
		cnt=3;
	}
	
	public static void addStudent()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter Id");
		int id=sc.nextInt();
		System.out.println("Enter Student Name");
		String name=sc.next();
		System.out.println("Enter Student Mark");
		System.out.println("Enter M1: ");
		int m1=sc.nextInt();
		System.out.println("Enter M2: ");
		int m2=sc.nextInt();
		System.out.println("Enter M3: ");
		int m3=sc.nextInt();
		starr[cnt]=new Student(id,name,m1,m2,m3);
		cnt++;
	}
	public static void DisplayAll()
	{
		for(int i=0;i<cnt;i++)
		{
			System.out.println(starr[i]);
		}
	}
	public static Student SearchById(int id)
	{
		for(int i=0;i<cnt;i++)
		{
			if(starr[i].getSid()==id) {
				return starr[i];
			}
		}
		return null;
	}
	public static Student[] getStudentByName(String sm)
	{
		Student [] arr=new Student[10];
		int count=0;
		for(int i=0;i<cnt;i++)
		{
			if(starr[i].getSname().equals(sm))
			{
				System.out.println("in if"+i);
				arr[count]=starr[i];
				count++;
			}
		}
		if(cnt>0)
		{
			return arr;
		}
		return null;
	}
	public static void UpdateMarks(int id)
	{
		Student s=StudentService.SearchById(id);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter marks 1: ");
		int r1=sc.nextInt();
		
		 for(int i=0;i<cnt;i++)
		 {
			 if(starr[i].setM1(r1));
		 }
		
		System.out.println("Enter marks 2:");
		int r2=sc.nextInt();
		
		System.out.println("Enter mark 3: ");
		int r3=sc.nextInt();
		
	
		
	}
}
