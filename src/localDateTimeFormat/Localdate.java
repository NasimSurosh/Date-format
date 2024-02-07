package localDateTimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Localdate {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);

		// adding
		LocalDate yesterday = date.minusDays(1);
		System.out.println(yesterday);
		
		
		// convert to string
		String convert = date.format(DateTimeFormatter.ISO_DATE);
		System.out.println(convert);
		
		// converting a string to localDdate
		
		String date2 = "2020-08-12";
		LocalDate date3= LocalDate.parse(date2);
		System.out.println(date3);
		
		// cgeck if a date is after another date
		LocalDate date4= LocalDate.parse("2023-05-23");
		LocalDate date5 = LocalDate.parse("2023-05-29");
		System.out.println(date5.isAfter(date4));
	}

}
