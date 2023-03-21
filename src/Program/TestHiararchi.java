package Program;


	class Vehicle3{
		void showA() {
			System.out.println("Vehicle is running");
		}
	}
	class TwoWheeler extends Vehicle3
	{
		void showB()
		{
			System.out.println("two wheeler running");
		}
	}
	
	class FourWheeler extends Vehicle3
	{
		void show()
		{
			System.out.println("four wheeler running");
		}
	}
	
    class TestHiararchi {
	public static void main(String[] args) {
		FourWheeler fw=new FourWheeler();
		fw.showA();
		fw.show();


	}

}
