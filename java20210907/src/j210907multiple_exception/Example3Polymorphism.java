package j210907multiple_exception;

public class Example3Polymorphism {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		String a = "aaa";
		
		try {
			int i = Integer.parseInt(a);
		}catch(Throwable e) {
			System.out.println("�ѹ������ͼ��� �߻�");
			e.printStackTrace();
		}
		System.out.println("���α׷� ����");
	}
}
