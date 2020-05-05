import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test4LocalDateTimeAPI {

	public static void main(String[] args) {
		
		Test4LocalDateTimeAPI nil1 = new Test4LocalDateTimeAPI();
		nil1.testLocalDateTime(); 

	}

	public void testLocalDateTime() {

		// Get the current Date time
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Current DateTime: " + currentTime);

		LocalDate date1 = currentTime.toLocalDate();
		System.out.println("Current Date1: " + date1);

		Month month = currentTime.getMonth();
		int day = currentTime.getDayOfMonth();
		int sec = currentTime.getSecond();

		System.out.println("Month: " + month + " Day: " + day + " Seconds: " + sec);

		LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2014);
		System.out.println("Date2: " + date2);

		// 14 March 2020

		LocalDate date3 = LocalDate.of(2020, Month.MARCH, 14);
		System.out.println("Date3: " + date3);

		// 22 hours 15 minutes

		LocalTime date4 = LocalTime.of(22, 15);
		System.out.println("Date4: " + date4);

		// Parse a string
		LocalTime date5 = LocalTime.parse("20:15:30");
		System.out.println("Date5: " + date5);

	}

}


/*Output

Current DateTime: 2020-05-05T14:53:05.335612500
Current Date1: 2020-05-05
Month: MAY Day: 5 Seconds: 5
Date2: 2014-05-10T14:53:05.335612500
Date3: 2020-03-14
Date4: 22:15
Date5: 20:15:30

*/