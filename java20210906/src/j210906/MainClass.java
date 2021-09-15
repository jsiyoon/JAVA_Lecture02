package j210906;

public class MainClass {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Malamute malamute = new Malamute();
		
		KindaCat kc = cat;
		KindaDog kd = malamute;
		
		Pet p1 = cat;
		Pet p2 =malamute;
		
		System.out.println(cat instanceof Cat);
		System.out.println(cat instanceof KindaCat);
		
		System.out.println(malamute instanceof Malamute);
		System.out.println(malamute instanceof KindaDog);
		
		System.out.println(cat instanceof Pet);
		System.out.println(malamute instanceof Pet);
	}
}
