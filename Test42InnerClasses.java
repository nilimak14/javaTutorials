
public class Test42InnerClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test42Robot robot1 = new Test42Robot(5);
		robot1.start();
 // Creating object of inner class
 //This will work only if Brain class is declared  as public		
		//Test42Robot.Brain brain = robot1.new Brain();
		//brain.think();
		
		// inner class Battery is grouped with outer class Test42Robot because  Battery is static class
		Test42Robot.Battery battery1 = new Test42Robot.Battery();
		battery1.charge();
		
		
	}

}
