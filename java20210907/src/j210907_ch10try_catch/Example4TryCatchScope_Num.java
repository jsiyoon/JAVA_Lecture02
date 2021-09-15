package j210907_ch10try_catch;

public class Example4TryCatchScope_Num {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		String str = "10aa0";
		
		int n = 0;
		try {
			n = Integer.parseInt(str);
		}catch(NumberFormatException e) {
			System.out.println("넘버포맷익셉션 발생");
		}
		System.out.println(n*2);
		
		System.out.println("시스템종료");
		
	}
}
