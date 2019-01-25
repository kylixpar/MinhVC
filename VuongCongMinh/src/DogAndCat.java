public class DogAndCat {
	public static void main(String[] args) {
		Dog dog1 = new Dog(1, "husky", "black", 13, 5);
		Cat cat1 = new Cat(2, "Sphynx", "orange", 4, 3);
		if(dog1.weight > cat1.weight) {
			dog1.park();
			cat1.run();
		}
		else {
			cat1.scratch();
			dog1.run();
		}
	}
}
