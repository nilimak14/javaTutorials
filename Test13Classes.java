
class Person {
	String  name;
	int age;
	
	// classes can contain:
	// 1. data
	//2, Methods
}

public class Test13Classes {

	public static void main(String[] args) {
		// Create objectc of class Person
			Person person1 = new Person();
			person1.name = "Neha";
			person1.age = 18;
			
			Person person2 = new Person();
			person2.name  = "Maya";
	    	person2.age  = 15;
		//another way to initialized object
	    // when we want to copy all data members 	
	    	Person person3 = new Person();
	    	person3 = person1;
	    	
	    			
			System.out.println(person1.name);
			System.out.println(person2.name);
			System.out.println(person3.name);

	}

}
