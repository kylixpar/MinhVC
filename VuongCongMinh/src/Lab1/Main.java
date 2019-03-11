package Lab1;


public class Main {
public static void main(String[] args) {
	MyThread myThread = new MyThread();
	System.out.println(myThread.getName());
	myThread.setName("MyJavaThread");
	System.out.println(myThread.getName());
	myThread.start();
	
	SubThread subThread = new SubThread();
	Thread thread = new Thread (subThread);
	thread.start();
}
}
