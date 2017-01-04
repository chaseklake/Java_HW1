import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee a = new Employee("Joe", "Smith", 2000);
		Employee b = new Employee("Joe", "Smith", 2500);
		b.setFName("Mary");
		b.setLName("Sue");

		System.out.printf("%s %s's yearly salary is %.2f\n",a.getFName(), a.getLName(), a.getMonthlySal());
		System.out.printf("%s %s's yearly salary is %.2f\n\n",b.getFName(), b.getLName(), b.getMonthlySal());

		System.out.println("After the 10% increase,");
		a.setMonthlySal(a.getMonthlySal() * 1.1);
		b.setMonthlySal(b.getMonthlySal() * 1.1);

		System.out.printf("%s %s's yearly salary is %.2f\n",a.getFName(), a.getLName(), a.getMonthlySal());
		System.out.printf("%s %s's yearly salary is %.2f\n",b.getFName(), b.getLName(), b.getMonthlySal());
	}
}