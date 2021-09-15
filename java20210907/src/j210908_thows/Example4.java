package j210908_thows;

public class Example4 {
	public static void main(String[] args) throws Exception {
		System.out.println("프로그램시작");
		method1();
		System.out.println("프로그램 종료");
	}
	
	public static void method1() throws Exception {
		System.out.println("메소드1 시작");
		method2();
		System.out.println("메소드1 종료"); //method2내 throw로 인해 실행되지 않음.
	}
	public static void method2() throws Exception{
		System.out.println("메소드2 시작");
		
		throw new Exception();
		
//		System.out.println("메소드2 종료"); //throw로 인해 밑에 코드 실행되지 않음.
	}
}
