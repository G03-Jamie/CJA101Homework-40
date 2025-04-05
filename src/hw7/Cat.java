package hw7;
public class Cat implements Pet{
	private static final long serialVersionUID = 1L;
	private String name;
	
	public Cat() {
		super();
	}
	
	public Cat(String name) {
		super();
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
