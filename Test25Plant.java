package world;

public class Test25Plant {
	
	// Bad practice 
	public String name;
	
	//Acceptable  practice..it's a final
	public final static int ID = 7;
	
	private String type; // Private data can be accessed only in this class it cannot
	                     // be accessed outside not even in Child class
	
	protected String size; //Protected data can be accessed within class
                           // class, subclass and same package
	
	int height ;  // No access specifier
	
	public Test25Plant() {
		this.name = "Myra";
		this.type  = "plant";
		this.size = "small";
	}

}
