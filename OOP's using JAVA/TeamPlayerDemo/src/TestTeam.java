import java.util.Scanner;

public class TestTeam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
		    
			System.out.print("1.Add new team\n2.display all teams\n");
			System.out.println("3.search team by captain\n4.Search Team by player name\n5.Search by Skill\n6.Exit");
			System.out.println("enter your choice : ");
			choice=sc.nextInt();
			
			 switch(choice)
		      {
		      case 1 : 
		    	  	TeamService.addNewTeam();
		    	      break;
		       
		      case 2 : 
		    	  	TeamService.displayAll();
		    	     break;
		    	     
		      case 3 :
		    	  	System.out.println("Enter Captain Name: ");
		    	  	String nm=sc.next();
		    	  	Team t=TeamService.getTeamByCaptainName(nm);
		    	  	if(t!=null)
		    	  	{
		    	  		System.out.println(t);
		    	  	}
		    	  	else
		    	  	{
		    	  		System.out.println("Team not found");
		    	  	}
		    	      break;
		    	      
		      case 4:
		    	  	System.out.println("Enter Player Name: ");
		    	  	String pn=sc.next();
		    	  	Team t1=TeamService.getTeamByPlayerName(pn);
		    	  	if(t1!=null)
		    	  	{
		    	  		System.out.println(t1);
		    	  	}
		    	  	else
		    	  	{
		    	  		System.out.println("Team Not found");
		    	  	}
		    	  	break;
		    	  	
		      case 5 :
		    	      System.out.println("Enter skill : ");
		    	  	  nm=sc.next();
		    	      TeamService.getBySkill(nm);
		    	      break;
                      
		      case 6 :	  
		    	      System.out.println("You are exit now..!");
		    	      System.exit(0);
		      }
		
	      }while(true); 

}
}