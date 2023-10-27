import java.util.Scanner;

public class TestPersonArray {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int choice =0;
		
		do{
			
			System.out.println("1.Add new Person\n2.Display all person\n3.Display by id\n4.Update mobile using id \n5.Display by name \n6.Exit");
			System.out.println("Please enter your choice : ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1 :
				    PersonService.addNewPerson();
				    break;
			
			case 2 :
			       PersonService.displayAll();
			       break;
		
			case 3 :
				  System.out.println("Enter id : ");
				  int id=sc.nextInt();
				  Person ob = PersonService.searchById(id);
			      if(ob!=null)
			      {
			    	 System.out.println(ob);  
			      }
			      else
			      {
			    	  System.out.println("Not Found " + id);
			      }
				  break;
		
			case 4 : 
				 System.out.println("enter id :" );
				 int id1 = sc.nextInt();
				 System.out.println("enter mobile no. :");
				 String mobile=sc.next();
				 PersonService.updateMobByID(id1,mobile);
			    break;
		
			case 5 :
				System.out.println("enter name");
				sc.nextLine();
				String nm=sc.nextLine();
				Person[] plist=PersonService.getByName(nm);
				if(plist!=null) {
					for(Person p:plist) {
						System.out.println(p);
					}
				}
				else {
					System.out.println("not found");
				}
				break;
		
			
			case 6 : 
				 System.out.println("You are exit");
				 System.exit(0);    
			    break;
		
			 default : System.out.println("Enter valid option");
			        break;
		
			}
			
			
		}while(true);
		
		
		
	}

}
