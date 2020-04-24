import java.io.Serializable;

public class Test47Person implements Serializable {
	private static final long serialVersionUID = 2341234;

	
	//Transient is used if we do not  want to Seriazlied any data
	private transient int id;
	private String name;
	
	private static int count;
	

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Test47Person.count = count;
	}

	public Test47Person() {
		System.out.println("Default constructor");
	}
	public Test47Person(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Two argument constructor");
	}

	@Override
	public String toString() {
		return "Test45Person [id=" + id + ", name=" + name + "] Count is:" + count;
	}

}
