class Machine{
	private String name;
	private int code;
	
	public Machine() {
		this("Pooja", 2); // Calling  3rd constructor here
		System.out.println("Constructoe running");
		name = "Priya"; // Variables can be initialized din Constructor
	}
	
	public Machine(String name) {
		System.out.println("Second Constructor is running");
		this.name  = name;
	}
	
	public Machine(String name, int code) {
		System.out.println("Third Constructor is running");
		this.name  = name;
		this.code  = code;
	}
	
}

public class Test18Constructors {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine();// at this stage Constructor is invoked
		
		// new Machine(); //another way to invoke  Constructor
		
		Machine machine2 = new Machine("Myra");
		Machine machine3 = new Machine("Saira", 8);

	}

}
