package j210907_ch10try_catch;

public class Example2TryCatch_Null {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		method1(null);			
		
		System.out.println("프로그램 종료");
	}
	
	public static void method1(Object o) {
		
		//NullPointerException 해결방법
		try {			
			System.out.println(o.hashCode());
		}catch(NullPointerException e){
			System.out.println("널 포인터 익셉션 오류입니다.");
		}
	}
}
