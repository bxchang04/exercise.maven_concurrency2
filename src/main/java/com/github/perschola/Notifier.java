package Concurrency;

public class Notifier implements Runnable{
	private Message msg;
	public Notifier(Message msg) {
		this.msg = msg;
	}
	
	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		
		
			System.out.println(tName+" started");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		synchronized(msg) {
			
		}
		
	}
	

	
}
