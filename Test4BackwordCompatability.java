import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Test4BackwordCompatability {

	public static void main(String[] args) {
		Test4BackwordCompatability nil5 = new Test4BackwordCompatability();
		nil5.testBackwordCompatability();

	}
	
	public void testBackwordCompatability() {
		//Get the current date
		
		Date currentDate = new Date();
		System.out.println("Current Date: " + currentDate );
		
		//Get the instance of currentdate in milliseconds
		
		Instant now  = currentDate.toInstant();
		ZoneId currentZone = ZoneId.systemDefault();
		
		LocalDateTime localDateTime  = LocalDateTime.ofInstant(now,currentZone);
		System.out.println("Local Date: " + localDateTime);
		
		ZonedDateTime zoneDateTime  = ZonedDateTime.ofInstant(now,currentZone);
		System.out.println("Zoned date: " + zoneDateTime);
		
		
	}

}

/*Output
Current Date: Tue May 05 15:57:27 IST 2020
Local Date: 2020-05-05T15:57:27.388
Zoned date: 2020-05-05T15:57:27.388+05:30[Asia/Calcutta]
*/