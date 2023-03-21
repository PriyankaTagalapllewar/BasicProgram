package Program;

class Vehicle
{
	 void show()
	 {
		 System.out.println("Vehicle running");
	 }
}
public class Bike extends Vehicle {
	 void show1()
	 {
		 System.out.println("Bike running");
	 }

	public static void main(String[] args) {

		Bike obbj=new Bike();
		obbj.show();
		obbj.show1();
	}

}
