package Lab1;

public class MyThread extends Thread{
	@Override
	public void run() {
		int a=2;
		int x = 0;
		
		while (x <10) {
			boolean flag = true;
			for (int i = 2;i<=a/2;i++) {
				if (a % i ==0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(a);
				x++;
				try {
					Thread.sleep(1500);
					
				}catch (InterruptedException e) {
					
				}
			}
			a++;
		}
	}
}
