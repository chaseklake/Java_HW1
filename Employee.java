public class Employee {
	private String fname, lname;
	private double monthlySalary;

	public Employee(String f, String l, double ms) {
		fname = f;
		lname = l;
		if (ms >= 0)
			monthlySalary = ms;
	}

	public String getFName() { return fname; }
	public String getLName() { return lname; }
	public double getMonthlySal() { return monthlySalary; }

	public void setFName(String f) { fname = f; }
	public void setLName(String l) { lname = l; }
	public void setMonthlySal(double ms) { 
		if (ms > 0)
			monthlySalary = ms; 
	}
}