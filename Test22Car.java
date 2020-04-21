
public class Test22Car extends Test22Machine{
	
		
	@Override
	public void start() {
		System.out.println("Car started");
	}

	public void wipeWindShield() {
		System.out.println("Wiping Winshield");
	}
	
	public void showInfo() {
		System.out.println("Car name is: " + name);
	}

	
	}

