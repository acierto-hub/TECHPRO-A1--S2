class Toy {
	String name;
	
	void displayName() {
		System.out.println("Toy Name: "+ name);
	}
}

public class Mainn {
	public static void main(String[] args) {
		
		Toy c1 = new Toy();
		c1.name = "Toy";
		
		c1.displayName();
	}
}
