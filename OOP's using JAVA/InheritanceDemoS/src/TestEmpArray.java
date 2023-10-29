import java.util.Scanner;

public class TestEmpArray {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int choice;
		
		do {
		
			System.out.print("\n1.add new Employee\n2.Modify salary \n3.display all");
			System.out.println("\n4.display by id \n5.calculate salary by id\n6.calculate Bonus\n7.exit");
            System.out.println("\nenter your coice :");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1 : 
				  System.out.println("\n1.salaried\n2.contract\n3.vendor");
				  int ch=sc.nextInt();
				  EmployeeService.addnewEmployee(ch);
				  break;
				  
			case 2 : 
				  break;
				  
			case 3 : 
				  EmployeeService.displayAll();
				  break;
				  
			case 4 : 
				  break;
				  
			case 5 : 
				  break;
				  
			case 6 : 
				  break;
				  
			case 7 : 
				  sc.close();
				  System.out.println("Thank you for visiting.....");
				  break;
			
			default : 
				    System.out.println("you enterd wrong choice..");
				    break;
			}
				
		}while(choice!=7);
		
	}

}
