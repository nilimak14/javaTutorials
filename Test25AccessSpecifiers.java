import world.Test25Plant;

public class Test25AccessSpecifiers {

	public static void main(String[] args) {
		Test25Plant plant1 = new  Test25Plant();
		System.out.println(plant1.name);
		System.out.println(plant1.ID);
		
		//Won't work ...type is private
		//System.out.println(plant1.type);
		
		//System.out.println(plant1.size); // Won't work as Test25AccessSpecifiers is in different package
		                                 // than Test25Plant Class and  size is protected
		
		//System.out.println(plant1.height); // Won't work as Test25AccessSpecifiers and Test25Plant are
		                                     // in different package and height is defined das no access specifier
                                            

	}

}
