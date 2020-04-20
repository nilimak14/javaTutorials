class Frog {
	private String name;
	private int age;
	public void setName (String newName) {
		name = newName;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

// new class which does same functionality ass Frog but uses "this" operator

class FrogA {
	String name;
	int age;
	public void setNameA (String name) {
		this.name = name;
	}
	
	public void setAgeA(int age) {
		this.age = age;
	}
	
	public String getNameA() {
		return name;
	}
	
	public int getAgeA() {
		return age;
	}
	
	public void setInfo(String name, int age )  {
		setNameA(name); // here no need to use "this"
		setAgeA(age);// here no need dto use "this"
	}
}


public class Test17SettersAndThis {

	public static void main(String[] args) {
		Frog frog1 = new  Frog();
		//frog1.name  = "kaya"; //can't use as this is private now
		//frog1age = 1; ////can't use as this is private now
		//usimg set method
		
		frog1.setName("Kaya");
		
		System.out.println(frog1.getName()); // prints "Kaya"
		
		
		//calling FrogA which uses this operator
		
		FrogA frogA1 = new FrogA();
        frogA1.setNameA("Kaya");
        frogA1.setAgeA(1);
		
		System.out.println(frogA1.getNameA()); // prints "Kaya"
		

	}

}
