
public class Student {
	private int sid;
	//private String sid;
	private String sname;
	private int m1,m2,m3;
	static int count;
//	static {
//		count=0;
//	}
//	private String generateID()
//	{	
//		count++;
//		if(this.sname!=null)
//		{
//			return this.sname.substring(0,3)+count;
//		}
//		return "@@@@"+count;
//	}
	public Student() {
		/*sid=0;
		sname=null;
		m1=0;
		m2=0;
		m3=0*/
		this(0,null,0,0,0);
		//this(null,0,0,0);
	}
	public Student(int sid,String sname,int m1,int m2,int m3)
	//public Student(String sname,int m1,int m2,int m3)
	{
		this.sid=sid;
		this.sname=sname;
		//this.sid=generateID();
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public String toString()
	{
		return "Sid ="+sid+"\nStudent Name="+sname+"\nMark 1= "+m1+"\nMark 2= "+m2+"\nMark 3="+m3;
	}
	public void setSid(int sid)
	{
		this.sid=sid;
	}

	public void setSname(String sname)
	{
		this.sname=sname;
	}
	public void setM1(int m1)
	{
		this.m1=m1;
	}
	public void setM2(int m2)
	{
		this.m2=m2;
	}
	public void setM3(int m3)
	{
		this.m3=m3;
	}
	public int getSid()
	{
		return this.sid;
	}

	public String getSname()
	{
		return this.sname;
	}
	public int getM1()
	{
		return this.m1;
	}
	public int getM2()
	{
		return this.m2;
	}
	public int getM3()
	{
		return this.m3;
	}
	
}
