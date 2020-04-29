import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Test13DataStructure {

	public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

	public static String[][] drivers = { { "Neha", "Dev", "Kyra" },
			                             { "Geeta", "Sita", "Dev", "Rohit" },
			                             { "Peter", "Mike", "Dev" } };

	public static void main(String[] args) {
		Map<String, Set<String>> person1 = new HashMap<String, Set<String>>();

		for (int i = 0; i < vehicles.length; i++) {
			String vehicle1 = vehicles[i];
			String[] driversList = drivers[i];

			Set<String> driverSet = new LinkedHashSet<String>();

			for (String driver : driversList) {
				driverSet.add(driver);

			}
			person1.put(vehicle1, driverSet);
		}

		// Example Usage
		
			Set<String> driversList = person1.get("ambulance");
			for (String driver : driversList) {
				System.out.println(driver);
			}
		

		// iterate through whole set

		System.out.print("\niterate through whole set\n");
		for (String vehicle2 : person1.keySet()) {
			System.out.print(vehicle2);
			System.out.print(": ");
			Set<String> driversList1 = person1.get(vehicle2);

			for (String driver1 : driversList1) {
				System.out.print(driver1);
				System.out.print(" ");
			}
			System.out.println();

		}
	}


}
