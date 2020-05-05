import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Test4TestPeriod {

	public static void main(String[] args) {
		Test4TestPeriod nil4 = new Test4TestPeriod();
		nil4.testPeriod();
		nil4.testDuration();
		

	}
	
	public void testPeriod() {
		LocalDate date1 = LocalDate.now();
		System.out.println("Current Date: " + date1);
		
		// Add 1 month to current date
		LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
		System.out.println("Next month: " + date2);
		
		Period  period = Period.between(date2, date1);
		System.out.println("Period: " + period);
	}
	
	public void testDuration() {
		
		LocalTime time1 = LocalTime.now();
		Duration twoHours = Duration.ofHours(2);
		
		LocalTime time2 = time1.plus(twoHours);
		Duration duration = Duration.between(time1,time2);
		System.out.println("Duration: " + duration);
		
		
	}

}

/*output
Current Date: 2020-05-05
Next month: 2020-06-05
Period: P-1M
Duration: PT2H
*/