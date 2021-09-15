package j210906;

public class Malamute extends KindaDog implements Pet,SledDog {
	
	@Override
	public void bark() {
		System.out.println("¸Û¸Û");
	}
	
	@Override
	public void sit() {
		System.out.println("ÀÚ¸®¿¡ ¾É½À´Ï´Ù.");
	}
	
	@Override
	public void pull() {
		System.out.println("½ä¸Å¸¦ ²ü´Ï´Ù.");
	}
}