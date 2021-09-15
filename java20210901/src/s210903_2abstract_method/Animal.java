package s210903_2abstract_method;

public abstract class Animal {
	//추상메소드가 있는 클래스는 반드시 추상클래스여야함.
	
	public abstract void sound(); //추상메소드(몸통이없는 메소드)
	
	public void walk() {
		System.out.println("4발로 걷는다.");
	}
}
