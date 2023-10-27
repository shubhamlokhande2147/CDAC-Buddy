
public class Person {

	private int pid;
	private String pname;
	private String mobile;



	public Person()
	{
		//		mobile =0;
		//		pname=null;
		//		mobile=null;

		this(0,null,null);
	}

	public Person(int pid,String pname,String mobile)
	{
		this.pid=pid;
		this.pname=pname;
		this.mobile=mobile;
	}

	//	public void displayPerson()
	//	{
	//		System.out.println("Pid : "+pid);
	//	    System.out.println("Pname : "+pname);
	//	    System.out.println("Mobile : "+mobile);
	//	}

	public String toString()
	{
		return "Pid : "+this.pid+" Pname : "+this.pname+" Mobile : "+this.mobile;
	}

	public void setpid(int pid)
	{
		this.pid=pid;
	}
	public void setpname(String pname)
	{
		this.pname=pname;
	}
	public void setmobile(String mobile)
	{
		this.mobile=mobile;
	}

	public int getpid()
	{
		return this.pid;
	}
	
	public String getpname()
	{
		return this.pname;
	}
	
	public String getmobile()
	{
		return this.mobile;
	}
	
}
