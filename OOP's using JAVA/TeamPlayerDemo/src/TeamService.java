import java.util.*;
public class TeamService {
	static Team[] tarr;
	static int cnt;
	static
	{
		tarr=new Team[10];
		cnt=0;
	}
	public static void addNewTeam()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Team No: ");
		int tno=sc.nextInt();
		
		System.out.println("Enter Team Name");
		String tname=sc.next();
		
		System.out.println("Enter captain number");
		int cno=sc.nextInt();
		
		System.out.println("Enter captain name");
		String cname=sc.next();
		
		System.out.println("Enter captain skills");
		String cskill=sc.next();
		
		Player c=new Player(cno,cname,cskill);
	
		Player [] plist=new Player[3];
		for(int i=0;i<plist.length;i++)
		{
			System.out.println("Enter Player Number: ");
			int pno=sc.nextInt();
		
			System.out.println("Enter Player name: ");
			String pname=sc.next();
			
			System.out.println("Enter Player Skills: ");
			String pskill=sc.next();
			
			plist[i]=new Player(pno,pname,pskill);
		}
		tarr[cnt]=new Team(tno,tname,c,plist);
		cnt++;
	}
	public static void displayAll()
	{
		for(int i=0;i<cnt;i++)
		{
			System.out.println(tarr[i]);
		}
	}
	public static Team getTeamByCaptainName(String nm) {
		// TODO Auto-generated method stub
		for(int i=0;i<cnt;i++)
		{
			if(tarr[i].getCaptain().getPname().equals(nm))
			{
				return tarr[i];
			}
		}
		return null;
	}
	public static Team getTeamByPlayerName(String pn) {
		// TODO Auto-generated method stub
		for(int i=0;i<cnt;i++)
		{
			Player[] prr=tarr[i].getPlist();
			for(int j=0;j<prr.length;j++)
			{
				if(prr[i].getPname().equals(pn))
				{
					return tarr[i];
				}
			}
		}
		return null;
	}
	

}
