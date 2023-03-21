package Program;

public class PracticeConstructor {

	int a;
	String s;

	PracticeConstructor() {
		a = 0;
		s = null;

	}

	void display() {
		System.out.println(a + " " + s);
	}

	public static void main(String[] args) {
		PracticeConstructor ps = new PracticeConstructor();

		ps.display();
		ps.a = 10;
		ps.s = "priya";
		System.out.println(ps.a + " " + ps.s);

	}

}
