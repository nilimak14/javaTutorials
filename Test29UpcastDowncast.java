class Machine{
	
	public void start() {
		System.out.println("Machin started.");
	}
}

class Camera extends Machine {
	
	public void start() {
		System.out.println("Camera started.");
	}
	
	public void snap() {
		System.out.println("Photo taken.");
	}
}

public class Test29UpcastDowncast {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		Camera cam1 = new Camera();
		
		mach1.start();
		cam1.start();
		cam1.snap();
		
		//Upcasting
		
	//	Machine mach2 = new Camera(); //allowed because of Polymorphism
		
		// sam can be written as
		
		Machine mach2 = cam1;  //object cam1 is upcasted to Machine object
		mach2.start();  // start() of Camera will be called
		
		//mach2.snap(); // won't work because mach2 can only referred to methods in Camera,
		              //which are overridden from Machine
		
		//Downcasting
		
		Machine  mach3 = new Camera();
	//	Camera cam2 = mach3; //won't work as we need to specify to the object we want to cast
		
		Camera cam2 = (Camera)mach3; 
		cam2.start();
		cam2.snap();
		
		// Following code is correct syntax wise ut will give error during runtime
		
		/*Machine mach4 = new Machine(); // correct
		Camera cam3 = (Camera)mach4;  //runtime error as class Machine cannot be cast to class Camera
		//cam3.start();
		//cam3.snap(); */
		

	}

}
