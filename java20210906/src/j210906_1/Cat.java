package j210906_1;

public class Cat implements Pet{

	@Override
	public void sit() {
		System.out.println("무시합니다.");
		
	}
	public void roll() {
		System.out.println("또 무시합니다."); //재정의 가능.
	}
}
