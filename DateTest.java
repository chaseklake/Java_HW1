import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) {
		Date sometime = new Date(9, 13, 1995);
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