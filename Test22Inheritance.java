
public class Test22Inheritance {

	public static void main(String[] args) {
		Test22Machine mach1 = new Test22Machine();
		mach1.start();
		mach1.stop();
		
		Test22Car car1 = new Test22Car();
		car1.start();
		car1.wipeWindShield();
		car1.showInfo();
		car1.stop();
		

	}

}
