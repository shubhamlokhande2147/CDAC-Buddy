
public class Book {
	private int bkid;
	private String bname;
	private String author;
	private Lesson l1;
	class Lesson{
		private int lessonid;
		private String lname;
		public void m1()
		{
			System.out.println("In lesson m1"+bkid);
		}
	}
	
	public Book() {
		super();
	}
	public Book(int bkid, String bname, String author) {
		super();
		this.bkid = bkid;
		this.bname = bname;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bkid=" + bkid + ", bname=" + bname + ", author=" + author + "]";
	}
}
