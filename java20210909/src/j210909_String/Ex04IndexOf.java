package j210909_String;

public class Ex04IndexOf {
	public static void main(String[] args) {
		String s1 = "spring";
		//index		 012345
		
		System.out.println(s1.length());
		
		System.out.println(s1.indexOf("ring")); //���ڰ� ��Ÿ���� ��ó�� index���� ���
		System.out.println(s1.indexOf("sp")); 
		System.out.println(s1.indexOf("ps")); //���� ��ã���� -1���
		
		String s2 = "java���� javascript�� �� �������.";
		System.out.println(s2.indexOf("script"));
		System.out.println(s2.indexOf("java"));
	}
}
