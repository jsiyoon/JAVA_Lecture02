package j210907_ch10try_catch;

public class Example3TryCatch_Num {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		String str = "10a0";
		
		//NumberFormatException 해결방법
		try { //Exception발생시 try블럭안 다음 명령문 실행x
			int n1 = Integer.parseInt(str);
			System.out.println(n1*2);
		}catch(NumberFormatException e) {
			System.out.println("넘버포맷익셉션 발생");
		}
		
		System.out.println("프로그램 종료");
	}
}
