import java.io.Serializable;

public class Test46Person implements Serializable {
	
	private static final long serialVersionUID = 23412345;
	
	private int id;
	private String name;

	public Test46Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Test45Person [id=" + id + ", name=" + name + "]";
	}

}
