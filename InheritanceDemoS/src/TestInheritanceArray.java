import java.util.Scanner;

public class TestInheritanceArray {

	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
		    System.out.println("1.add new Employee\n2.Modify salary\n3.display all");
	       	System.out.println("4.display by id \n5.calculate salary by id\n6.calculate Bonus\n7.exit");		
	        System.out.println("enter your chice : "); 
	        choice = sc.nextInt();
	        
	        switch(choice)
	        {
	        case 1 : 
    			    System.out.println("1.salaried\n2.contract\n3.vendor");
    			    System.out.println("enter choice : ");
    			    int ch = sc.nextInt();
	        	    InheritanceServices.addnewEmployee(ch);
	        	    break;
	        	    
	        case 2 : 
	        		System.out.println("Enter id");
	        		int id=sc.nextInt();
	        		System.out.println("Enter Salary");
	        		double sal=sc.nextDouble();
	        		boolean status=InheritanceServices.ModifySalByID(sal,id);
	        		if(status)
	        		{
	        			System.out.println("Modification done");
	        		}
	        		else
	        		{
	        			System.out.println("id not found");
	        		}
	        		
	        		break;

	        case 3 : 
	        	    InheritanceServices.displayAll();
	        	    break;

	        case 4 : 
	        		System.out.println("Enter Id that you want to display ");
	        		int id4=sc.nextInt();
	        		Employee e=InheritanceServices.searchByIDN(id4);
	        		if(e!=null)
	        		{
	        			System.out.println(e);
	        		}
	        		else
	        		{
	        			System.out.println("ID not found");
	        		}
	        	    break;

	        case 5 : 
	        	System.out.println("Enter id that you want to find salary");
	        	int pid=sc.nextInt();
	        	double salary=InheritanceServices.calculateSalaryById(pid);
	        	if(salary!=-1)
	        	{
	        		System.out.println("Salary of Employee : "+(salary));
	        	}
	        	else
	        	{
	        		System.out.println("Employee Not Found");
	        	}
	        	break;

	        case 6 : 
	        	System.out.println("Enter Id you want to find bonus");
	        	int id3=sc.nextInt();
	        	double bonus=InheritanceServices.calculateBonusByID(id3);
	        	if(bonus!=-1)
	        	{
	        		System.out.println("Total Bonus Calculated: "+bonus);
	        	}
	        	else
	        	{
	        		System.out.println("Id not found");
	        	}
	        	    break;

	        case 7 : 	        	   
	        	    System.out.println("you are exit now..!");
	        	    System.exit(0);
	        	    break;

	        default :
	        	    System.out.println("you enter wrong choice...");
	        	    break;
	         
	        }
		
		}while(choice!=7);
	}

}
