package j210907multiple_exception;

public class Example {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		String[] arr = {"3", "4", "a"};
		
		try {
			int n = Integer.parseInt(arr[0]);
			System.out.println(n);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("����ε��� �ƿ�����ٿ����ͼ��� �߻�");
		}catch(NumberFormatException e) {
			System.out.println("�ѹ������ͼ��� �߻�");
		}
		
		
		System.out.println("���α׷� ����");
	}
}
