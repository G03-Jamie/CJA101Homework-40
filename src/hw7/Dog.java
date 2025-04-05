package hw7;
public class Dog implements Pet{
	private static final long serialVersionUID = 1L;
	private String name;
	
	public Dog() {
		super();
	}
	
	
	public Dog(String name) {
		super();
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking!");
	}
}
