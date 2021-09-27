package j210927_lamda;

public class Ex01Anonymous {
	public static void main(String[] args) {
		MyInterface1 o1;
		o1 = new MyClass1(); //객체생성
		
		//Interface구현과 객체생성 한번에
		MyInterface1 o2 = new MyInterface1() {
			@Override
			public void method1() {
			}
			@Override
			public void mehtod2() {
			}
		};
	}
}

interface MyInterface1{
	public void method1();
	public void mehtod2();
}
class MyClass1 implements MyInterface1{
	//interface구현

	//추상메소드 재정의
	@Override
	public void method1() {
	}
	@Override
	public void mehtod2() {
	}
}
