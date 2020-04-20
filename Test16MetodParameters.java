class Robot {
	public void speak( String text) {
		System.out.println(text);
		
	}
	
	public void jump(int height) {
		System.out.println("Jumping " + height);
	}
	
	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " meters in direction " + direction );
	}
	
}
public class Test16MetodParameters {

	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak("Hi I am Sam");
		sam.jump(8);
		sam.move("East", 10.1);
		
		//another way of passing parameters
		
		String greetings = "Hi There";
		sam.speak(greetings);
		
		int value = 5;
		sam.jump(value);
	
	}

}
