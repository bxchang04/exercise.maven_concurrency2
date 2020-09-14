package Concurrency;

public class Waiter implements Runnable {
	private Message msg;
	
	public Waiter(Message msg) {
		this.msg = msg;
	}
	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		
		synchronized(msg) {
			System.out.println(tName+" waiting to get notified at time:" +System.currentTimeMillis());
			try {
				msg.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(tName+ " waiter thread got notified at time:" +System.currentTimeMillis()+", "+tName+ " processed:" +msg);
		}
		
	}

}
