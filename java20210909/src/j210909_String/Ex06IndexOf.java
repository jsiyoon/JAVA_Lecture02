package j210909_String;

public class Ex06IndexOf {
	public static void main(String[] args) {
		String s1 = "java�� javascript�� java�� oop�� javascript�� oop��";
		
		System.out.println(s1.indexOf("java"));
		System.out.println(s1.lastIndexOf("java"));
		System.out.println(s1.indexOf("java",5)); //5��° �ε��� ���� ù��° java�� ù��° �ε���
		System.out.println(s1.indexOf("java",10));
		System.out.println(s1.indexOf("java",20));
		}
}
