package j210909_String;

public class Ex07CharAt {
	public static void main(String[] args) {
		//charAt
		
		String s1 = "java";
		
		System.out.println(s1.charAt(0));
		
		char c = s1.charAt(1);
		
		System.out.println(c);
		
		char d = s1.charAt(4); //StringIndexOutOfBoundsException
		
		System.out.println(d); //오류메시지 뜸 
	}
}
