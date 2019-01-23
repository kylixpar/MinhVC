package baitap;
import java.util.Scanner;
public class SoNguyen {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter n: ");
		int n =  scanner.nextInt();
		System.out.printf("Tat ca cac so nguyen to nho hon %d la: ", n);
		if (n>2) {
			System.out.print(2);
		}
		for (int i = 3; i < n; i+=2 ) {
			if (soNguyenTo(i)) {
				System.out.print(" " + i);
			}
		}
	}
	public static boolean soNguyenTo(int n) {
		if (n<2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++ ) {
			if (n % i ==0) {
				return false;
			}
		}
		return true;
	}
}
	
