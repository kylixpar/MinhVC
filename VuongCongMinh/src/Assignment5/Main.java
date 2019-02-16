package Assignment5;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		Shirt shirt1 = new Shirt(1, "Down-shirt", 100, 30, 39, "Yellow", "Chanel");
		Shirt shirt2 = new Shirt(2, "Denim-shirt", 110, 10, 40, "Red", "Gucci");
		Shirt shirt3 = new Shirt(3, "Formal-shirt", 120, 15, 41, "Black", "D&G");
		Shirt shirt4 = new Shirt(4, "Dress-shirt", 130, 55, 42, "White", "Louis Vuitton");
		Shirt shirt5 = new Shirt(5, "T-shirt", 90, 25, 43, "Orange", "D&G");
		Ring ring1 = new Ring(1, "Golden", 1000, 35, 15, "gold");
		Ring ring2 = new Ring(2, "Diamond", 5000, 25, 20, "Diamond");
		Ring ring3 = new Ring(3, "Silve", 100, 15, 10, "Silve");
		Ring ring4 = new Ring(4, "Golden Diamond", 1500, 20, 15, "Gold & Diamond");
		Ring ring5 = new Ring(5, "Black Golden", 3000, 5, 30, "gold");
		
		Order order1 = new Order(0);
		order1.Buy(shirt1, 2);
		order1.Buy(ring1, 3);
		System.out.println("Product list purchased: ");
		order1.List();
		System.out.println("List of remaining products: ");
		ArrayList<Shirt> shirt = new ArrayList<>();
		ArrayList<Ring> ring = new ArrayList<>();
		shirt.add(shirt1);
		shirt.add(shirt2);
		shirt.add(shirt3);
		shirt.add(shirt4);
		shirt.add(shirt5);
		ring.add(ring1);
		ring.add(ring2);
		ring.add(ring3);
		ring.add(ring4);
		ring.add(ring5);
		
		for (Shirt value: shirt) {
			System.out.println("Shirt: " + value.name + "quatity: " + value.qty);
		}
		for (Ring value: ring) {
			System.out.println("Ring: " + value.name + "quatity: " + value.qty);
		}
	}
}
