
public class Test37Abstract {

	public static void main(String[] args) {
		Test37Camera cam1 = new Test37Camera();
		cam1.setId(5);
		
		Test37Car car1 = new Test37Car();
		car1.setId(4);
		
		car1.run();
		
	//	Test37Machine mach1 = new Test37Machine();  //won't work as Machine is abstract class

	}

}
