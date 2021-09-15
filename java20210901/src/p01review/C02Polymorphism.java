package p01review;

public class C02Polymorphism {
	//다형성
	
	//1.상위타입으로 자동 변환(값 할당)
	//2.메서드는 인스턴스 메소드로 실행된다.
	public static void main(String[] args) {
		Animal al = new Animal();
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		
		Animal a2 = c1;
		Animal a3 = d1;
		
		a2.cry();
		a3.cry();
	}
}
class Animal{
	public void cry() {
		System.out.println("동물이 웁니다.");
	}
}
class Cat extends Animal{
	@Override
	public void cry() {
		System.out.println("고양이가 웁니다.");
	}
}
class Dog extends Animal{
	public void AutoControl() {
		System.out.println("자동운전");
	}
}
