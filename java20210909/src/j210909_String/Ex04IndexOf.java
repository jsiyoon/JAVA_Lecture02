package j210909_String;

public class Ex04IndexOf {
	public static void main(String[] args) {
		String s1 = "spring";
		//index		 012345
		
		System.out.println(s1.length());
		
		System.out.println(s1.indexOf("ring")); //글자가 나타나는 맨처음 index숫자 출력
		System.out.println(s1.indexOf("sp")); 
		System.out.println(s1.indexOf("ps")); //글자 못찾으면 -1출력
		
		String s2 = "java보다 javascript가 더 쉬웠어요.";
		System.out.println(s2.indexOf("script"));
		System.out.println(s2.indexOf("java"));
	}
}
