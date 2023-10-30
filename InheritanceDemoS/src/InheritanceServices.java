import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class InheritanceServices {
	
	static Employee[] emparr;
	static int cnt;
	
	static 
	{
	  	emparr = new Employee[100];
	  	emparr[0] = new SalariedEmployee(1,"harsh","1234567890","emp@email.com","Hr","MainHead",LocalDate.of(2007,7, 7),50,100);
	  	emparr[1] = new SalariedEmployee(2,"shubham","2121122112","emp@email.com","Hr","MainHead",LocalDate.of(2007,7, 7),500,120);
	  	emparr[2] = new ContractEmployee(3,"om","12121212","emp@email.com","Hr","MainHead",LocalDate.of(2007,7, 7),50,200);
	  	emparr[3] = new ContractEmployee(4,"vivek","1241245656","emp@email.com","Hr","MainHead",LocalDate.of(2007,7, 7),50,300);
	  	emparr[4] = new Vendor(5,"shiv","123467878","emp@email.com","Manager","MainHead",LocalDate.of(2007,7, 7),50,1000);
	  	emparr[5] = new Vendor(6,"sid","1234677787","emp@email.com","SalesManager","MainHead",LocalDate.of(2007,7, 7),50,1500);
	  	cnt=6;
	}

	public static void addnewEmployee(int ch)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter id : ");
		int id = sc.nextInt();
		
		System.out.println("enter name : ");
		String nm = sc.next();
		
		System.out.println("enter mobile : ");
		String mb = sc.next();
		
		System.out.println("enter email : ");
		String em = sc.next();
		
		System.out.println("enter department : ");
		String dept = sc.next();
		
		System.out.println("enter designation : ");
		String desg = sc.next();
		
		System.out.println("eneter joining date(dd/mm/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
          switch(ch)
          {
            case 1 :
	            	System.out.println("enter sal : ");
	                double sal = sc.nextDouble();
	                System.out.println("enter bonus : ");
	                double bonus = sc.nextDouble();
	        	  	emparr[cnt] = new SalariedEmployee(id,nm,mb,em,dept,desg,ldt,sal,bonus);
	        	  	System.out.println("emp data is inserted..");
	        	  	cnt++;
	        	    break;
        	    
            case 2 :
	            	System.out.println("enter hrs : ");
	                int hrs = sc.nextInt();
	                System.out.println("enter charges : ");
	                double charges = sc.nextDouble();
	        	  	emparr[cnt] = new ContractEmployee(id,nm,mb,em,dept,desg,ldt,hrs,charges);
	        	  	System.out.println("emp data is inserted..");
	        	  	cnt++;
	        	    break;

            case 3 :
	            	System.out.println("enter no. of emp : ");
	                int noofemp = sc.nextInt();
	                System.out.println("enter amount : ");
	                double amount = sc.nextDouble();
	        	  	emparr[cnt] = new Vendor(id,nm,mb,em,dept,desg,ldt,noofemp,amount);
	        	  	System.out.println("emp data is inserted..");
	        	  	cnt++;
	        	    break;
          }
	
		
	}

	public static void displayAll() {
		for(int i=0; i<cnt; i++)
		{
			System.out.println(emparr[i]);
		}
		
	}
	
	private static int searchByID(int pid)
	{
		for(int i=0;i<cnt;i++)
		{
			if(emparr[i].getPid()==pid)
			{
				return i;
			}
		}
		return -1;
	}
	public static Employee searchByIDN(int pid)
	{
		for(int i=0;i<cnt;i++)
		{
			if(emparr[i].getPid()==pid)
			{
				return emparr[i];
			}
		}
		return null;
	}
	public static double calculateSalaryById(int pid)
	{
		int pos=searchByID(pid);
		if(pos!=-1)
		{
			return emparr[pos].calculatesal();
		}
		return -1;
	}
	public static double calculateBonusByID(int pid)
	{
		int pos=searchByID(pid);
		if(pos!=-1 && emparr[pos] instanceof SalariedEmployee)
		{
			return emparr[pos].calculateBonus();
		}
		return -1;
	}

	public static boolean ModifySalByID(double sal, int id) {
			int pos=searchByID(id);
			if(pos!=-1)
			{
				if(emparr[pos] instanceof SalariedEmployee)
				{
					((SalariedEmployee)emparr[pos]).setSal(sal);
				}
				else if(emparr[pos] instanceof ContractEmployee)
				{
					((ContractEmployee)emparr[pos]).setCharges(sal);
				}
				else
				{
					((Vendor)emparr[pos]).setAmount(sal);
				}
				return true;
			}
			return false;
	}


	


}
