package j210909_String;

public class Ex06IndexOf {
	public static void main(String[] args) {
		String s1 = "java와 javascript는 java도 oop고 javascript도 oop다";
		
		System.out.println(s1.indexOf("java"));
		System.out.println(s1.lastIndexOf("java"));
		System.out.println(s1.indexOf("java",5)); //5번째 인덱스 이후 첫번째 java의 첫번째 인덱스
		System.out.println(s1.indexOf("java",10));
		System.out.println(s1.indexOf("java",20));
		}
}
