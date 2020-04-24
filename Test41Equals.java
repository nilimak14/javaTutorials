class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person [id=" + id + ", name=" + name + "]" ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
// we need to override method equals with data with which we want to compare
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

public class Test41Equals {

	public static void main(String[] args) {
		Person person1  = new Person(5, "Myra");
		Person person2 = new Person(5, "Myra");
		
		//System.out.println(person1 == person2); //checks if objects person1 and person2 are same?
		                                        // output is false
		// if we give ass below still result is false  as these are two different objectcs with different 
		// memory though they have same data
		//Person person1  = new Person(5, "Myra");
		//Person person2 = new Person(5, "Myra");

		//In order to comapre data of two objects we use method "equals"
		
		System.out.println(person1.equals(person2));
		
		Integer num1 = 5;
		Integer num2 = 5;
		
		System.out.println(num1.equals(num2));
		
		Double value1 = 4.5;
		Double value2 = 4.5;
		
		System.out.println(value1.equals(value2));
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println(str1.contentEquals(str2));
	}

}
