import java.util.Arrays;

public class Team {

	private int tno;
	private String tname;
	private Player Captain;
	private Player[] plist;
	
	
	public Team() {
		super();
	}


	public Team(int tno, String tname, Player captain, Player[] plist) {
		super();
		this.tno = tno;
		this.tname = tname;
		Captain = captain;
		this.plist = plist;
	}


	public int getTno() {
		return tno;
	}


	public void setTno(int tno) {
		this.tno = tno;
	}


	public String getTname() {
		return tname;
	}


	public void setTname(String tname) {
		this.tname = tname;
	}


	public Player getCaptain() {
		return Captain;
	}


	public void setCaptain(Player captain) {
		Captain = captain;
	}


	public Player[] getPlist() {
		return plist;
	}


	public void setPlist(Player[] plist) {
		this.plist = plist;
	}


	@Override
	public String toString() {
		return "Team [tno=" + tno + ", tname=" + tname + ", Captain=" + Captain + ", plist=" + Arrays.toString(plist)
				+ "]";
	} 
	
	
}
