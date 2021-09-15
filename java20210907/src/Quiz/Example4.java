package Quiz;

public class Example4 {
	public static void main(String[] args) {
		//ClassCastException발생 코드
		Object o = "java";
		
		String s = (String) o;
//		Number n =(Number) o;
		
		System.out.println("프로그램 종료");
		
		throw new ClassCastException();
		
	}
}
