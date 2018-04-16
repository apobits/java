import java.util.Calendar;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Administrador
 *
 */
public class TestOne {

	class Person {
		int age;

		public Person(int initialAge) {
			if (initialAge < 0) {
				age = 0;
				System.out.println("Age is not valid, setting age to 0.");
			} else
				age = initialAge;
		}

		public void yearPasses() {
			age++;
		}

		public void amIOld() {
			if (age < 13)
				System.out.println("You are young.");
			else if (age >= 13 && age < 18)
				System.out.println("You are a teenager.");
			else
				System.out.println("You are old.");
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		Calendar returnedDate = Calendar.getInstance();
		int rDay = scan.nextInt();
		int rMonth = scan.nextInt();
		int rYear = scan.nextInt();
		returnedDate.set(rYear, rMonth, rDay, 0, 0, 0);

		Calendar dueDate = Calendar.getInstance();
		int dDay = scan.nextInt();
		int dMonth = scan.nextInt();
		int dYear = scan.nextInt();
		dueDate.set(dYear, dMonth - 1, dDay, 0, 0, 0);
		System.out.println(returnedDate.getTime());
		System.out.println(dueDate.getTime());

		if (returnedDate.getTime().compareTo(dueDate.getTime()) <= 0) {
			System.out.println(0);
		} else if (returnedDate.get(Calendar.YEAR) == dueDate.get(Calendar.YEAR)
				&& returnedDate.get(Calendar.MONTH) == dueDate.get(Calendar.MONTH)) {
			System.out.println(15 * (returnedDate.get(Calendar.DAY_OF_MONTH) - dueDate.get(Calendar.DAY_OF_MONTH)));
		} else if (returnedDate.get(Calendar.YEAR) == dueDate.get(Calendar.YEAR)) {
			System.out.println(500 * (returnedDate.get(Calendar.MONTH) - dueDate.get(Calendar.MONTH)));
		} else {
			System.out.println(10000);
		}
	}
}
