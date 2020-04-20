class PersonA {
	String  name;
	int age;
	
	void speak() {
		System.out.println("My name is " + name + " and  I am " + age + " years old");
	}
	
	void sayHello() {
		System.out.println("Hello " + name);
	}
}	

public class Test14Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create objectc of class Person
		PersonA person1 = new PersonA();
		person1.name = "Neha";
		person1.age = 18;
		person1.speak();
		person1.sayHello();
				
		PersonA person2 = new PersonA();
		person2.name  = "Maya";
		person2.age  = 15;
		person2.speak();
		person2.sayHello();
		    
	}


}
