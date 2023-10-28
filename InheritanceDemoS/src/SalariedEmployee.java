import java.time.LocalDate;

public class SalariedEmployee extends Employee
{
	private double sal;
	private double bonus;
	
	
	public SalariedEmployee() {
		super();
	}


	public SalariedEmployee(int pid, String pname, String mobile, String email, String department, String designation,
			LocalDate doj, double sal, double bonus) {
		super(pid, pname, mobile, email, department, designation, doj);
		this.sal = sal;
		this.bonus = bonus;
	}


	public double getSal() {
		return sal;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}


	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	@Override
	public String toString() {
		return super.toString() + "SalariedEmployee [sal=" + sal + ", bonus=" + bonus + ", toString()=" + "]";
	}
	
	

}
