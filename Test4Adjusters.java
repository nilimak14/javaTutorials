import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Test4Adjusters {

	public static void main(String[] args) {
		Test4Adjusters nil4 = new Test4Adjusters();
		nil4.testAddjusters();

	}
	
	public void testAddjusters() {
		//Get the current date
		LocalDate date1 = LocalDate.now();
		System.out.println("Current dat: " + date1);
		
		//Get the  new Tuesday
		LocalDate nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println("Next Tuesday on: " + nextTuesday);
		
		//Get the second saturday of month
		LocalDate firstInyear = LocalDate.of(date1.getYear(), date1.getMonth(), 1);
		LocalDate secondSaturday = firstInyear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY))
				.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		
		System.out.println("Second Saturdady: " + secondSaturday);
				
		
		
	}

}

/*Output
 * Current dat: 2020-05-05
Next Tuesday on: 2020-05-12
Second Saturdady: 2020-05-09

*/

