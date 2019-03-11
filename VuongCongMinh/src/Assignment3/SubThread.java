package Assignment3;

public class SubThread implements Runnable{
	@Override
	public void run() {
		for (int i=0; i<50;i++) {
			System.out.println("SubThread: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
