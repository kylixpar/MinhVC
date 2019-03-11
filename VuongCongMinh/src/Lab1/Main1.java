package Lab1;

public class Main1 {
	public static void main(String[] args) {
		
		SubThread subThread = new SubThread();
		Thread thread = new Thread (subThread);
		thread.start();
	}
}
