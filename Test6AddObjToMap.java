//If we want to use our own objects in Set, we need to override hashCode and equal methods

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "{id is: " + id + "; name is: " + name + "}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class Test6AddObjToMap {

	public static void main(String[] args) {
		
		Person p1 = new Person(0, "Neha");
		Person p2 = new Person(1, "Myra");
		Person p3 = new Person(2, "Kyra");
		Person p4 = new Person(1, "Myra");
	
		
		
		Map<Person, Integer> map1 = new HashMap<Person, Integer>();

		map1.put(p1, 1);
		map1.put(p2, 2);
		map1.put(p3, 3);
		map1.put(p4, 1);

		for (Person key : map1.keySet()) {
			System.out.println(key + ": " + map1.get(key));  
		}

		System.out.println();
		
		Set<Person> set1 = new LinkedHashSet<Person>();
		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
		set1.add(p4);

		System.out.println(set1);  
		
		
		// Objects p2 and p4 are identical.
		//Just HashMap and Set will not identify if these objects are same or not
		// In order to identify unique objects we need equal methods
		// so we have overridden equal method in Person class
	}

}

/*Output before overriding equal method
{id is: 0; name is: Neha}: 1
{id is: 1; name is: Myra}: 1
{id is: 1; name is: Myra}: 2
{id is: 2; name is: Kyra}: 3

[{id is: 0; name is: Neha}, {id is: 1; name is: Myra}, {id is: 2; name is: Kyra}, {id is: 1; name is: Myra}]
  
 */

/* Output after overriding  equal method
{id is: 0; name is: Neha}: 1
{id is: 1; name is: Myra}: 1
{id is: 2; name is: Kyra}: 3

[{id is: 0; name is: Neha}, {id is: 1; name is: Myra}, {id is: 2; name is: Kyra}]

*/


