import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test4ZonedDateTimeAPI {

	public static void main(String[] args) {
		Test4ZonedDateTimeAPI nil2 = new Test4ZonedDateTimeAPI();
		nil2.testZonedDateTime();

	}

	public void testZonedDateTime() {
		// Get cucrrent date and time

		ZonedDateTime date1 = ZonedDateTime.parse("2020-05-05T14:41:36+05:30[Asia/Calcutta]");
		System.out.println("Date1: " + date1);

		ZoneId id = ZoneId.of("Europe/Paris");
		System.out.println("ZoneId: " + id);

		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("Current Zone: " + currentZone);

	}

}

/*Output
Date1: 2020-05-05T14:41:36+05:30[Asia/Calcutta]
ZoneId: Europe/Paris
Current Zone: Asia/Calcutta
*/