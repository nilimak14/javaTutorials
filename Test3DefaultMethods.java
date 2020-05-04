
interface Vehicle {
	default void print() {
		System.out.println("I am a Vehicle");
	}

	static void blowHorn() {
		System.out.println("Blowing Horn");

	}

}

interface FourWheeler {
	default void print() {
		System.out.println("I am a four wheeler");
	}

}

class Car implements Vehicle, FourWheeler {

	public void print() {
		Vehicle.super.print();
		FourWheeler.super.print();
		Vehicle.blowHorn();
		System.out.println("I am a Car");
	}

}

public class Test3DefaultMethods {

	public static void main(String[] args) {
       
		Vehicle vehicle1 = new Car();
		vehicle1.print();
	}

}


/* Output
I am a Vehicle
I am a four wheeler
Blowing Horn
I am a Car
*/