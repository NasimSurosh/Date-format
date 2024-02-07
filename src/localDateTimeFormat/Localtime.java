package localDateTimeFormat;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class Localtime {

	public static void main(String[] args) {
		
		// current time
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		// specifying our oun time
		LocalTime time1 = LocalTime.of(7, 46, 31);
		System.out.println(time1);
		
		// substract hours and minutes
		LocalTime time2 = LocalTime.of(10, 30, 46);
		LocalTime time3 = time2.minusHours(1);
		LocalTime time4 = time3.minusMinutes(56);
		System.out.println(time4);
		
		// add hours and minutes
		LocalTime time5 = LocalTime.of(11, 35);
		System.out.println(time5);
		LocalTime time6 = time5.plusHours(6);
		System.out.println(time6);
		
		// Time Zones
		ZoneId zone1 = ZoneId.of("Asia/Kabul");
		ZoneId zone2 = ZoneId.of("America/Chicago");
		LocalTime time1_1 = LocalTime.now(zone1);
		LocalTime time2_1= LocalTime.now(zone2);
		System.out.println(time1_1);
		System.out.println(time2_1);
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt.getZone());
		
		

	}

}
