import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Test4ChronoUnits {

	public static void main(String[] args) {
		Test4ChronoUnits nil3 = new Test4ChronoUnits();
		nil3.testChronoUnits();

	}

	public void testChronoUnits() {

		// Get the Current date

		LocalDate today = LocalDate.now();
		System.out.println("Current date: " + today);

		// Add 1 week to current date
		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		System.out.println("Next week: " + nextWeek);

		// Add 1 month to current date
		LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
		System.out.println("Next month: " + nextMonth);

		// Add 1 year to current date
		LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
		System.out.println("Next year: " + nextYear);
		
		// Add 10 yeasr to current date
		LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
		System.out.println("Next Decade: " + nextDecade);

	}

}


/*Output
Current date: 2020-05-05
Next week: 2020-05-12
Next month: 2020-06-05
Next year: 2021-05-05
Next Decade: 2030-05-05

*/