import java.util.*;
public class TestStudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Choice");
		int choice=0;
		do {
			System.out.println("1.Add Student \t 2.Display All \t 3. Display By ID \t 4.Display by name \t 5.Update Mark using Id \t 6.Exit");
		
		choice=sc.nextInt();
		switch(choice) {
		
		case 1:
			StudentService.addStudent();
			break;
			
		case 2:
			StudentService.DisplayAll();
			break;
			
		case 3:
			System.out.println("Enter Student id you want to search");
			int id=sc.nextInt();
			Student s=StudentService.SearchById(id);
			if(s!=null)
			{
				System.out.println(s);
			}
			else
			{
				System.out.println("Not Found"+(id));
			}
			break;
		
		case 4:
			System.out.println("enter name");
			sc.nextLine();
			String nm=sc.nextLine();
			Student[] slist=StudentService.getStudentByName(nm);
			if(slist!=null)
			{
				for(Student p:slist)
				{
					System.out.println(p);
				}
			}
			else
			{
				System.out.println("Not Found");
			}
			break;
		
		case 5:
	            System.out.println("enter the id : ");
	            int id1=sc.nextInt();
	            StudentService.UpdateMarks(id1);
		     	break;
		
		case 6:
			System.out.println("Exiting ....");
			System.exit(0);
			break;
		
		}
		}while(true);
	}
}
