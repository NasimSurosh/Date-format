package assignment;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateDateOfBirth {

	public static void main(String[] args) {

		System.out.println("Enter date of birth in YYYY-MM-DD");
		Scanner scan = new Scanner(System.in);

		String valueOfDate = scan.nextLine();

		LocalDate date = LocalDate.parse(valueOfDate);

		System.out.println("Your age is:" + calculateAgeAndDisplay(date) + " years");
		scan.close();

	}

	public static int calculateAgeAndDisplay(LocalDate date) {

		LocalDate curentDate = LocalDate.now();

		if ((date != null) && (curentDate != null)) {

			return Period.between(date, curentDate).getYears();
		} else {
			return 0;
		}

	}

}
