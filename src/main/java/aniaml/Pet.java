package aniaml;

public abstract class Pet implements Animal {
	public Pet(String name) {
		this.name = name;
	}

	private String name;
	// protected is available in child classes
	protected String ownerName;

	//getter
	public String getName() {
		return name;
	}
	// overridden method
	public void sleep() {
		System.out.println("Я сплю в постели хозяина");
	}
	// new abstract method
	public abstract void peeInTray();


}
