public class Cat {
	public int catId;
	public String type;
	public String color;
	public int weight;
	public int age;
	public Cat(int catId, String type, String color, int weight, int age) {
		this.catId = catId;
		this.type = type;
		this.color = color;
		this.weight = weight;
		this.age = age;
	}
	
	public void scratch() {
		System.out.println("scratch...");
	}
	public void eat() {
		System.out.println("Cat is eating.");
	}
	public void run() {
		System.out.println("Cat is running.");
	}

}
