
public class Test24Machine implements Test24Info {
	// implements word  forces to override all methods of Interface Test24Info
	// A Class can implements number of Interfaces separated by comma
	private int  id = 8;
	
	public void start() {
		System.out.println("Machine is started");
	}

	@Override
	public void showInfo() {
		System.out.println("Machine id is: " + id);
		
	}

}
