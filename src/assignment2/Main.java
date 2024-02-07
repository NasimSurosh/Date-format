package assignment2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Prompt the user to enter a starting date in the format "YYYY-MM-DD."
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter a starting date (YYYY-MM-DD): ");
        String startingDateString = scanner.nextLine();
        
        // Parse the user input into a LocalDate object representing the starting date.
        LocalDate startingDate = LocalDate.parse(startingDateString, dateFormatter);

        // Prompt the user to enter the number of days into the future.
        System.out.print("Enter the number of days into the future: ");
        int numberOfDays = scanner.nextInt();

        // Calculate the future date by adding the specified number of days to the starting date.
        LocalDate futureDate = startingDate.plusDays(numberOfDays);
        System.out.println("Future date after " + numberOfDays + " days: " + 
        futureDate.format(dateFormatter));
    }
}
