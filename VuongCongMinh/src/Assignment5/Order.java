package Assignment5;

import java.util.ArrayList;

public class Order {
	public int IdOrder;
	public double total;
	public ArrayList<String> ProductList = new ArrayList<>();
	
	public Order(int IdOrder) {
		this.IdOrder = IdOrder;
		this.total = 0;
	}
	
	public void Buy(Shirt s, int qty) {
		if (qty<= s.qty) {
			ProductList.add(s.name);
			s.qty -= qty;
			this.total += s.price*qty;
		}
		else System.out.println("Product not enough.");
	}
	
	public void Buy(Ring r, int qty) {
		if (qty<= r.qty) {
			ProductList.add(r.name);
			r.qty -= qty;
			this.total += r.price*qty;
		}
		else System.out.println("Product not enough.");
	}
	public void List() {
		for (String value: ProductList) {
			System.out.println(value);
		}
		System.out.println("Total: " + this.total);
	}
}
