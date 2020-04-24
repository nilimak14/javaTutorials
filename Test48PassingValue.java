
public class Test48PassingValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test48PassingValue passvalue = new Test48PassingValue();
		
		// passing by value for non-primitive  --start
		int num = 9;

		System.out.println("1. Number is : " + num);
		passvalue.show(num);

		System.out.println("4. Number is : " + num);
		// passing by value for non-primitive  -- end
		
		// passing by value for primitive  -- start
		
		System.out.println();
		
		Test48Person person = new Test48Person("Neha");
		System.out.println("1. Person is: " + person);
		
		passvalue.show(person);
		
		System.out.println("4. Person is: " + person);
		
		// passing by value for primitive  -- end

	}

	public void show(int value) {
		System.out.println("2. Number is : " + value);

		value = 7;

		System.out.println("3. Number is : " + value);

	}
	
	public void show( Test48Person person) {
		System.out.println("2. Person is: " + person);
		
	//	person.setName("Kira");
		
		person = new Test48Person("Myra");
		
		person.setName("Jack");
		
		System.out.println("3. Person is: " + person);
		
		
	}

}


//output is 

//1. Number is : 9
//2. Number is : 9
//3. Number is : 7
//4. Number is : 9

//1. Person is: Test48Person [name=Neha]
//2. Person is: Test48Person [name=Neha]
//3. Person is: Test48Person [name=Jack]
//4. Person is: Test48Person [name=Neha]