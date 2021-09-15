package j210910;

public class Ex13Example {
	public static void main(String[] args) {
		String str = "pizza는 콤비네이션 pizza";
		
		String rep = str.replaceAll("[pP]izza", "피자");
		
		System.out.println(rep);
	}
}
