class Machine {
	public void start() {
		System.out.println("Machine starting...");
		
	}
}

interface Plant{
	public void grow();
}

public class Test32AnonymousClasses {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.start();  // will print "Machine starting..."
		
		//we can override method strat() , while creating object
		// this type of object is child class of Machine which has no name so it is 
		// called Anonymous class
		Machine mach2 = new Machine() {
			@Override public void start() {
				System.out.println("Camera starting ...");
			}
		};
		
		mach2.start();
		
		Plant plant1 = new Plant()  {

			@Override
			public void grow() {
			System.out.println("Plant is growing");
				
			}
			
		};
		plant1.grow();

	}

}
