package j210927_lamda;

public class Ex02Annoymous {
	public static void main(String[] args) {
		MyInterface2 o1 = new MyInterface2() {
			@Override
			public void method() {
				System.out.println("실행코드1");
			}
		};
		
		//lamda
		MyInterface2 o2 = () ->{ //() : 파라미터, -> : lamda기호
			System.out.println("실행코드2");
		};
		
		o1.method();
		o2.method();
	}
}

interface MyInterface2 {
	public void method();//추상메소드가 단 하나!
	
}