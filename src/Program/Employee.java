package Program;

class Account {
	private int balance;
	private int accountno;
	private String actname;

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public void setBalance(int x) // Setter Method
	{
		balance = x;

	}

	public int getBalance() // Getter Method
	{

		balance = balance + 2000;
		return balance;

	}

	public String getActname() {
		return actname;
	}

	public void setActname(String actname) {
		this.actname = actname;
	}
}

public class Employee {

	public static void main(String[] args) {
		Account act = new Account();
		// act.balance=1000;
		act.setBalance(10000);
		// System.out.println("Account Balance - " + act.balance);
		System.out.println("Account Balance - " + act.getBalance());

		act.setAccountno(123456);
		System.out.println("Account No  - " + act.getAccountno());
		
		act.setActname("Priyanka");
		System.out.println("Account Name  - " + act.getActname());

	}
}
