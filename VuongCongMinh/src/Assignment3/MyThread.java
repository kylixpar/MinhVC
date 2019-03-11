package Assignment3;

public class MyThread extends Thread{
	@Override
	public void run() {
		for (int i=0; i<50; i++) {
			System.out.println("My Thread: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
