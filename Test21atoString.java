class ShapeA {

	private int id;
	private String name;
	
	public ShapeA(int id, String name) {
		this.id = id;
		this.name  = name;
	}
	
	public String toString() {
		//return "Hello";
		//return id + ": " + name; // int id will be converted in string and then used
		
		//same result can be obtained using StringBuilder
		
	  //StringBuilder sb = new StringBuilder();
		//sb.append(id).append(": ").append(name);
		//return sb.toString();
		
		//using String.format
		
		//same result can be obtained using String.format
		return String.format("%4d: %s", id, name);
		
	}
	
}
public class Test21atoString {

	public static void main(String[] args) {
	ShapeA shape1 = new ShapeA(7, "Meena");
	
	ShapeA shape2 = new ShapeA(5, "Neha");
		
	//System.out.println(shape1); // will print "Hello"
	
	System.out.println(shape1);
	System.out.println(shape2);

	}

}
