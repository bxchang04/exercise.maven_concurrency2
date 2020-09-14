package Concurrency;

public class Account implements Runnable{
	int balance = 50;
	
	
	public int getBalance() {
		return balance;
	}

	

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(balance >= 10) {
				balance-=10;
				System.out.println(Thread.currentThread().getName() 
						+ " completes the withdrawal");
				
				
			}else {
				System.out.println("Not enough in account for"+ Thread.currentThread().getName() 
						+ " to withdraw");
			}
		}

		
	}
}
