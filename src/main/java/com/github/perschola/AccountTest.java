package Concurrency;

public class AccountTest {

	public static void main(String[] args) {
		Account a = new Account();
		Thread t1 = new Thread(a,"Reema");
		Thread t2 = new Thread(a,"Ranjeet");
		
		t1.start();
		t2.start();
	}

}
