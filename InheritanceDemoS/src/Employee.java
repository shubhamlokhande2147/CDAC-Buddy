import java.time.LocalDate;

public class Employee extends Person
{
	private String department;
	private String designation;
	private LocalDate doj;
	

	public Employee() {
		super();
	}

	
	public Employee(int pid, String pname, String mobile, String email, String department, String designation,
			LocalDate doj) {
		super(pid, pname, mobile, email);
		this.department = department;
		this.designation = designation;
		this.doj = doj;
	}


	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}


	@Override
	public String toString() {
		return super.toString() + "Employee [department=" + department + ", designation=" + designation + ", doj=" + doj +"]";
	}

	
}
