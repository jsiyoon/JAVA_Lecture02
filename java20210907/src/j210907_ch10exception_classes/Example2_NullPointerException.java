package j210907_ch10exception_classes;

public class Example2_NullPointerException {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Object o1 = null;
		method(o1);
		
		System.out.println("프로그램 정상 종료");
	}

	public static void method(Object o){
		o.hashCode(); //NullPointerException
	}
}
