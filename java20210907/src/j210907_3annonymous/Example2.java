package j210907_3annonymous;

public class Example2 {
	public static void main(String[] args) {
		
		//클래스작성 , 객체 생성 동시
		// 구현 클래스는 추상 메소드를 꼭 재정의!
		MyInterface2 i1 = new MyInterface2() {

			@Override
			public void method1() {
				System.out.println("구현 클래스의 메소드1");
			}
		};
		i1.method1();
	}
}
