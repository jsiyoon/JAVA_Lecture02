package j210909_String;

public class Ex05LastIndexOf {
	public static void main(String[] args) {
		String s1 = "java���� javascript�� �� �������";
		 //�ε���		 012345678910
		
		System.out.println(s1.indexOf("java"));
		System.out.println(s1.lastIndexOf("java")); //���������� ������ java������ ù��° �ε��� ���
		System.out.println(s1.lastIndexOf("python")); //���� ������ -1return
		
	}
}
