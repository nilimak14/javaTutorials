
public class Test44Recursion {

	public static void main(String[] args) {
		calculate();
		
		int value = 5;
		calculate1(value);
		System.out.println(value);  //will print 5
		
		calculate2(value);  // calling  this method will give stackoverflow error
		                    //Java.lang.StackOverflowError
		
		System.out.println(factorial(4));
		

	}
	
	public static void calculate() {
		System.out.println("Hello");
	}
	
	public static void calculate1(int value) {
		value = value -1;
		System.out.println(value); //will print 4
	}

	
	//calling method itself within method i.e. recursive call of same method
	// It is not advisable to call recursive methods as it may give stackoverflow error if
	// not  handled correctly
	// if at all we need to use recursion, we need  to give condition when to stop
	public static void calculate2(int value) {
		System.out.println(value);
		if ( value == 1) {
			return;
		}
		
		calculate2(value-1);
	}
	
	// method to calculate factorial of any number
	
	public static int factorial(int value) {
		System.out.println(value);
		if ( value == 1) {
			return 1;
		}
		
		return factorial(value-1) * value;
		
	}
}
