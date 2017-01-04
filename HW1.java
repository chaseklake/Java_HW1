import java.util.Scanner;

public class HW1 {
	public static void main(String[] args) {
		//Setup Scanner
		Scanner input = new Scanner(System.in);
		
		//Infinite loop
		boolean done = false;
		while (!done) {
			//Ask user for input
			System.out.println("Choose a program:\n\t1. Pr1_1\n\t2. Pr1_2\n\t3. Pr1_3\n\t4. Pr1_4\n\t5. Exit");
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

		System.out.println("Enter your weight (Imperial: lbs, Metric: kg): ");
		double weight = input.nextDouble();
		System.out.println("Enter your height (Imperial: inches, Metric: meters): ");
		double height = input.nextDouble();

		double bmi = weight / (height * height);
		if (x == 1)
			bmi *= 703;

		System.out.printf("Your BMI is %.2f\n",bmi);

		System.out.println("BMI VALUES\nUnderweight:\tless than 18.5\nNormal:\tbetween 18.5 and 24.9\nOverweight:\tbetween 25 and 29.9\nObese:\t30 or greater\n");
	}
	
}