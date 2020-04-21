
public class Test24Interface {

	public static void main(String[] args) {
		
		Test24Machine mach1 = new Test24Machine();
		mach1.start();
		
		Test24Person person1 = new Test24Person("Neha");
		person1.greet();
		
		Test24Info info1 = new Test24Machine(); //this is tru because Machine implements Interface Test24Info
				
		//info1 can access only those methods which are in Interface
		info1.showInfo();
		
		Test24Info info2 = person1; //because person1 is object of Test24Person and  it implements interface  Test24Info 
		info2.showInfo();
		
		outputInfo(mach1);// because Test24Machine implements Tes24Info interface
		outputInfo(person1); //because Test24Person implements Tes24Info interface

	}
	
	private static void outputInfo(Test24Info info) {
		info.showInfo();
	}

}
