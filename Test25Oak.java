package world;

public class Test25Oak extends Test25Plant  {
	
	public Test25Oak() {
	//won't work as type is private	
	//	type = "tree";
		
		this.size = "Large"; // This works because size is protected and can be accessed
		                     // within class, subclass and same package
		                     // Test25Oak is subclass of Test25Plant
		
		this.height = 10;// no access specifier. It works  because Test25Plant and Test25Oak
		                 // are in same package
	}

}
