class Bear {
	String name;
	
	void displayName() {
		System.out.println("Bear Name: "+ name);
	}
}

public class Seatworksix {
	public static void main(String[] args) {
		
		 Bear n1=null;
		
		try {
			n1.displayName();
		}catch (Exception e) {
			System.out.println("Error: cannot find Bear");
		}
	}
}
