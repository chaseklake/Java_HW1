import java.util.Scanner;

public class HW1 {
	public static void main(String[] args) {
		//Setup Scanner
		Scanner input = new Scanner(System.in);
		
		//Infinite loop
		boolean done = false;
		while (!done) {
			//Ask user for input
			System.out.println("Choose a program:\n\t1. Pr1_1\n\t2. Pr1_2\n\t3. Pr1_3\n\t4. Pr1_4\n\t5. Pr1_5\n\t6. Pr1_6\n\t7. Exit");
			int userin = input.nextInt();
			//Run the program they asked for
			switch(userin) {
				case 1:
				Prgm1_1();
				break;

				case 2:
				Prgm1_2();
				break;

				case 3:
				char[] tests = {'A','B','C','a','b','c','$','*','+','/',' '};
				for (char i : tests) {
					Prgm1_3(i);
				}
				break;

				case 4:
				Prgm1_4();
				break;

				case 5:
				EmployeeTest();
				break;

				case 6:
				Prgm1_6();
				break;

				default:
				done = true;
			}
		}
	}


	//Program 1.1: Odd or Even
	static void Prgm1_1() {
		System.out.println("Program 1.1: Odd or Even\n");
		Scanner input = new Scanner(System.in);
		int x;
		System.out.println("Enter a number: ");
		x = input.nextInt();
		if (x % 2 == 0)
			System.out.println("That number is even\n");
		else
			System.out.println("That number is odd\n");
	}

	//Program 1.2: Area of a Circle
	static void Prgm1_2() {
		final double PI = 3.14;
		System.out.println("Program 1.2: Area of a Circle\n");
		Scanner input = new Scanner(System.in);
		double r;
		System.out.println("Enter a radius: ");
		r = input.nextDouble();
		double a = PI * r * r;
		System.out.printf("The area of a circle with radius %.3f is %.3f\n", r, a);
	}

	//Program 1.3: Integer value of a Character
	static void Prgm1_3(char a) {
		System.out.printf("\t%c in decimal is %d\n",a,(int)a);
	}

	//Program 1.4: Body Mass Index
	static void Prgm1_4() {
		System.out.println("Please choose a formula:\n\t1. Imperial\n\t2. Metric\n");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		while (x > 2 || x < 1) {
			System.out.println("Invalid input, please try again.\n\t1. Imperial\n\t2. Metric\n");
			x = input.nextInt();
		}

		System.out.println("Enter your weight: ");
		double weight = input.nextDouble();
		System.out.println("Enter your height (Imperial: inches, Metric: meters): ");
		double height = input.nextDouble();

		double bmi = weight / (height * height);
		if (x == 1)
			bmi *= 703;

		System.out.printf("Your BMI is %.2f\n",bmi);

		System.out.println("BMI VALUES\nUnderweight:\tless than 18.5\nNormal:\tbetween 18.5 and 24.9\nOverweight:\tbetween 25 and 29.9\nObese:\t30 or greater\n");
	}

	//Program 1.5: Employee Class program
	static void EmployeeTest() {
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
		System.out.printf("%s %s's yearly salary is %.2f\n\n",b.getFName(), b.getLName(), b.getMonthlySal());
	}

	//Program 1.6: Date Class program
	static void Prgm1_6() {
		Date sometime = new Date(9, 13, 2016);
		System.out.printf("Default time is: ");
		sometime.displayDate();

		sometime.setMonth(1);
		System.out.printf("Changing month to %d...\n", sometime.getMonth());
		sometime.setDay(4);
		System.out.printf("Changing day to %d...\n", sometime.getDay());
		sometime.setYear(2017);
		System.out.printf("Changing year to %d...\n", sometime.getYear());
		
		System.out.printf("Or in other words, current day is: ");
		sometime.displayDate();
	}
}

//Program 1.5: Employee Class
class Employee {
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

//Program 1.6: Date Class
class Date {
	private int month, day, year;

	public Date(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}

	public int getMonth() { return month; }
	public int getDay() { return day; }
	public int getYear() { return year; }

	public void setMonth(int m) { month = m; }
	public void setDay(int d) { day = d; }
	public void setYear(int y) { year = y; }

	public void displayDate() {
			System.out.printf("%d/%d/%d\n", month, day, year);
	}
}