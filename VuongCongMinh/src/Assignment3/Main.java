package Assignment3;

public class Main {
	public static void main(String[] args) throws InterruptedException{
		SubThread subThread = new SubThread();
		Thread thread = new Thread(subThread);
		MyThread myThread = new MyThread();
		thread.start();
		myThread.start();
		for(int i=0;i<50;i++) {
			System.out.println("Thread: "+i);
			Thread.sleep(1000);
		}
	}
}
