package j210907_2casting;

public class Example3Instanceof {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		String str = "java";
		method(str);
		
		int[] arr = {1,1};
		method(arr);
		
		System.out.println("���α׷� ����");
	}
	public static void method(Object o) {
		System.out.println(o instanceof String); // true / false�� ���
		
		if(o instanceof String) {
			String s = (String) o;
			System.out.println("String���� ��ȯ ����");
		}
		else {
			System.out.println("String���� ��ȯ �Ұ���");
		}
	}
}
