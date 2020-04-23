
public class Test37Car extends Test37Machine {

	@Override
	public void start() {
		System.out.println("Car starting..");
		
	}

	@Override
	public void doStuff() {
		System.out.println("Car cleaning..");
		
	}

	@Override
	public void shutdown() {
		System.out.println("Car stopping..");
		
	}

}