
public class Test42Robot {
	private int id;
	
	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking." );
		}
		
	}
	
	// if you want inner classes to be grouped with Outer class define it as static
	static class Battery{
		public void charge() {
			System.out.println("Battery charging");
		}
	}

	public Test42Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Starting robot: " + id);
		Brain brain1 = new Brain();
		brain1.think();
		
		String name = "Neha";
		
		class Temp{
			public void doSoemthing() {
				System.out.println("ID is: " + id); //Can access non-static data member
				System.out.println("My name is: " + name);
			}
		}
		
		Temp temp1 = new Temp();
		temp1.doSoemthing();
	}

}
