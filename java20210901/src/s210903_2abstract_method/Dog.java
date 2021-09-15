package s210903_2abstract_method;

public class Dog extends Animal{
	//상위클래스가 추상 메소드 가지고 있다면
	//하위 클래스가 실체 클래스일때
	//꼭 추상메소드 재정의 해야함.
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
