package j210907_ch10exception_classes;

public class Example4_NumberFormatException {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		String s1 = "100";
		System.out.println(dbl(s1));
		
		String s2 = "10a0";
		System.out.println(dbl(s2)); //NumberFormatException
		
		System.out.println("프로그램 종료");
	}
	public static int dbl(String s) {
		return Integer.parseInt(s) * 2;
	}
}
