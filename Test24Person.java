
public class Test24Person implements Test24Info {
	
	private String name;
	
	
	public Test24Person(String name) {
		this.name = name;
	}


	public void greet() {
		System.out.println("Hello there!");
	}


	@Override
	public void showInfo() {
		System.out.println("Person name is: " + name);
		
	}

}
