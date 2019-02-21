package Assignment7;
import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
	public static void main(String[] args) {
		boolean value1 = true;
		Scanner scanner1 = new Scanner(System.in);
		ArrayList<News> news1 = new ArrayList<>();
		while (value1) {
			Task();
			Scanner scanner2 = new Scanner(System.in);
			int choose = scanner2.nextInt();
			switch (choose) {
			case 1: {
				System.out.println("Enter ID: ");
				int ID = scanner2.nextInt();
				System.out.println("Enter title: ");
				String Title = scanner1.nextLine();
				System.out.println("Enter PublishDate: ");
				String PublishDate = scanner1.nextLine();
				System.out.println("Enter Author: ");
				String Author = scanner1.nextLine();
				System.out.println("Enter Content: ");
				String Content = scanner1.nextLine();
				System.out.println("Enter 3 number int: ");
				int num1 = scanner2.nextInt();
				int num2 = scanner2.nextInt();
				int num3 = scanner2.nextInt();
				news1.add(new News(ID,Title,PublishDate,Author,Content, new int[]{num1, num2, num3}));
				break;
			}
			case 2: {
				for (News value: news1) {
					value.Display();
				}
				break;
			}
			case 3: {
				for (News value: news1) {
					value.Calculate();
					value.Display();
				}
				break;
			}
			case 4: {
				value1 = false;
				System.out.println("Exit!");
			}
			}
		}
		
	}
	private static void Task() {
		System.out.println("1. Insert News");
		System.out.println("2. View list news");
		System.out.println("3. Average rate");
		System.out.println("4. Exit");
	}
}
