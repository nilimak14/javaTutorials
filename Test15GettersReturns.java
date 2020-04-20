 class PersonB {
	String name;
	int age;
	
	void speak() {
		System.out.println("My Name is " + name);
	}
	
	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;
		
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
}



public class Test15GettersReturns {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create objectc of class Person
		PersonB person1 = new PersonB();
		person1.name = "Neha";
		person1.age = 25;
		
		int years = person1.calculateYearsToRetirement();
		System.out.println("Years till Retirement " + years);
		
		String name = person1.getName();
		int age = person1.getAge();
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
		
	}
}
