package world;

public class Test25Field {
	
	Test25Plant plant2 = new Test25Plant();
	public Test25Field() {
		System.out.println(plant2.size); // this works  because  Test25Field class is
		                                 // in the same package as of Test25Plant classs
	}

}
