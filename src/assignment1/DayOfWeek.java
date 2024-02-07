package assignment1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter a date (YYYY-MM-DD): ");
        String dateString = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateString, dateFormatter);

        java.time.DayOfWeek dayOfWeek = date.getDayOfWeek();
        String dayOfWeekString = dayOfWeek.toString();

        System.out.println("The day of the week for " + dateString + " is " + dayOfWeekString + ".");
    
    }
}
