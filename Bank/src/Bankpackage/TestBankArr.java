package Bankpackage;

import java.time.LocalDate;
import java.util.Scanner;

public class TestBankArr {
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
    int choice=0;
    
    do {
	 
    	System.out.println("\n1.add new customer\n2.display all\n3.display by name\n4.show balance by name\n5.Deposit money\n6.Withdrow money\n7.exit");
    	System.out.print("enter choice : ");
    	choice=sc.nextInt();
    	
    	switch(choice)
    	{
    	case 1 : 
    		System.out.println("\n1.Saving Account\n2.Current Account");
    		System.out.println("Choose Option");
    		int ch = sc.nextInt();
    		BankServices.addNewCustomer(ch);	
    	 break;
    		 
    	case 2 :
    		
    		BankServices.displayAll();
   		 break;
   		 
    	case 3 :
    		System.out.println("Enter name ");
    		String nm =  sc.next();
    		Customer s = BankServices.displayByName(nm);
    		if(s!=null)
    		{
    		   System.out.println(s);
    		}
    		else 
    			System.out.println("Account not found");
   		 break;
   		 
    	case 4 :
    		System.out.println("Enter name ");
               nm =  sc.next();    
               BankServices.showBal(nm);
   		 break;
    	case 5 :
    		System.out.println("Enter name ");
            nm =  sc.next();   
    		System.out.println("enter amount to deposited");
    		double b=sc.nextDouble();
    		BankServices.deposit(nm, b);
    		break;
    		
    	case 6 : 	
    		System.out.println("Enter name ");
            nm =  sc.next();   
    		System.out.println("enter amount to withdrow");
    		 b=sc.nextDouble();
    		BankServices.withdrow(nm, b);
    		break;
    	case 7 :
    		 System.out.println("you are exit now..");
  			 System.exit(0);
    		 break;
   		      
   		 default :
   			  System.out.println("wrong choice..");
   			  break;
    	}
    	
    }while(choice!=7);
	

}
}
