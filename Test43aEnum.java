// using Enum
// will use same example from Test43Enum using  Enum now

public class Test43aEnum {

	
	public static void main(String[] args) {
		Test43Animal animal = Test43Animal.CAT;
		switch(animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;
	
		}
		

	}


}
