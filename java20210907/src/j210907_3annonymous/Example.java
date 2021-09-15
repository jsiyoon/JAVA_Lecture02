package j210907_3annonymous;

public class Example {
	public static void main(String[] args) {
		//MyInterface i1 = new MyInterface();
		MyInterface i2 = new MyClass1();
		
		//클래스와 인스턴스(객체) 한번에 만들 수 있음
		MyInterface i3 = new MyInterface() {
			
		};
	}
}
