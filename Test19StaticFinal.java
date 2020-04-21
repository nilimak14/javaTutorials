class Thing {
	public 	String name;
	public  static String  description;
	
	public final static int LUCKY_NUM = 14;// final means constant and cannot change its value later
	
	public static int count = 0;
	
	public int id;
	public Thing(){
		
		id = count;
		count++;
	}
	public void showName() {
		System.out.println(name);
	//	System.out.println(description);//Instance method can access static data
		System.out.println("Objectc id: " + id + "," + description);//Instance method can access static data
	}
	
	public static void showInfo() {
		//System.out.println("Hello");
		System.out.println(description);//Static methods can access static variables
	//	System.out.println(name); //Static variable  can not accessnon-static variables
	}
}

public class Test19StaticFinal {

	public static void main(String[] args) {
		
		//Static variables are Class variables so it cn be called with class directly
		Thing.description = "It is a thing.";
		//System.out.println(Thing.description);
		
		Thing.showInfo();
		
		System.out.println("Before creating object count is :" + Thing.count);
		
		//Non-static  variables are instance variable so they are called with instance
		// of class i.e. with objects
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("After creating object count is :" + Thing.count);
		
		thing1.name  = "Maya";
		thing2.name = "Mahek";
		
		//System.out.println(thing1.name);
		//System.out.println(thing2.name);
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Thing.LUCKY_NUM);
		

	}

}
