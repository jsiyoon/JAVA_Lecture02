package j210908;

public class Example1RuntimeException {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		// RuntimeException�� ��ӹ��� Exception�� 
		// try / catch�� ����ص� �ǰ� ���ص� ��
		NullPointerException e = new NullPointerException();
		
		throw e;
		
		
	}
}
