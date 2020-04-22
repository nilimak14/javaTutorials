
public class Test28Casting {

	public static void main(String[] args) {

		byte byteValue = 20;
		short shortValue = 54;
		int  intValue = 854;
		long longValue = 23456;
		float floatValue = 345.6f;
		
		// another way to define flowt value
		
		float floatValue1 = (float)98.2;
		
		double  doubleValue = 34.3;
		
		// casting
		
		intValue = (int)longValue; // casting long  to int;
		System.out.println(intValue);
		
		doubleValue = intValue; //its allowed and double can fit int so no need to cast
		
		System.out.println(doubleValue); //will print 23456.0
		
		intValue = (int)floatValue;
		
		System.out.println(intValue); // it will print 345 only .6f is removevd
		
		byteValue = (byte)128; 
		
		System.out.println(byteValue);//Will print -128 as 127 is max value for byte.
		                              // so result is not as expected because 128 is too big for byte
		
		
		

	}

}
