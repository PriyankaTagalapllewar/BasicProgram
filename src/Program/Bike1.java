package Program;

class Vehicle1 {
	void showA() {
		System.out.println("Vehicle is running");
	}
}

class Scooty extends Vehicle1 {
	void showB() {
		System.out.println("Scooty is running");
	}
}

public class Bike1 extends Vehicle1 {
	void showC() {
		System.out.println("Bike is running");
	}

	public static void main(String[] args) {
		Bike1 bb=new Bike1();
		bb.showA();
		bb.showC();
		
 
	}

}
