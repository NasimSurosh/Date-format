package localDateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Before formating: " + currentDateTime);

		System.out.println();

		DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd-MM-yyyy h:mm a");

		String formatedDate = currentDateTime.format(dTF);
		System.out.println("After formating: "+ formatedDate);

	}

}
