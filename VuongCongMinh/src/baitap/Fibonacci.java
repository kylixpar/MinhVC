package baitap;
import java.util.Scanner;
public class Fibonacci {
	private static Scanner scanner =  new Scanner(System.in);
	public static void main(String[] args) {
		long sum = 0;
		System.out.println("nhap n: ");
		int n = scanner.nextInt();
		for (int i= 0; i < n;i++) {
			sum = sum + fibonacci(i);
		}
		System.out.printf("Tong %d so dau tien trong day fibonacci: " + sum, n);
	}

	public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
	
}