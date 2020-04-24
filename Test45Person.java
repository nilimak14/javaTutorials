import java.io.Serializable;

public class Test45Person implements Serializable{
	
//	private static final long serialVersionUID = 2341234;
	private static final long serialVersionUID = 2341234;
	
	// When we give serialVersionUID, objects are written with this Id. so we must read them with same id.
	// if we change serialVersionUID and try to read, it will give error.
	
	private int id;
	private  String name;
	
	public Test45Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Test45Person [id=" + id + ", name=" + name + "]";
	}
	
	

}
