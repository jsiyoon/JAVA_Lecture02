package j210909_String;

public class Ex10Replace {
	public static void main(String[] args) {
		//replace
		String s1 = "java spring";
		String r1 = s1.replace('a', 'z');
		
		System.out.println(s1);
		System.out.println(r1);
		
		String s2 = "���� ���� �������� �� �������̰� ���� ���� �������� �� �������̴�.";
		String r2 = s2.replace("����", "factory");
		
		System.out.println(s2);
		System.out.println(r2);
	}
}
