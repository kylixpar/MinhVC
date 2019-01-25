public class Dog {
	public int dogId;
	public String type;
	public String color;
	public int weight;
	public int age;
	public Dog(int dogId, String type, String color, int weight,int age) {
		this.dogId = dogId;
		this.type = type;
		this.color = color;
		this.weight = weight;
		this.age = age;
	}
	public void park() {
		System.out.println("go.. go.. :3");
	}
	public void eat() {
		System.out.println("Dog is eating.");
	}
	public void run() {
		System.out.println("Dog is running.");
	}
	

}
