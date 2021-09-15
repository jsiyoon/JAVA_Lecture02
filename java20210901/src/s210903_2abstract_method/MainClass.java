package s210903_2abstract_method;

public class MainClass {
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		
		d1.sound();
		c1.sound();
		animalSound(new Cat());
		animalSound(new Dog());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}