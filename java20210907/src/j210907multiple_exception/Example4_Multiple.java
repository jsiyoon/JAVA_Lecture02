package j210907multiple_exception;

public class Example4_Multiple {
	public static void main(String[] args) {
		String[] arr = {"1", "a"};
		
		try {
			int n = Integer.parseInt(arr[1]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε��� ����");
		}catch(Exception e) {
			System.out.println("�ͼ��� �߻�");
		}
		System.out.println("���α׷� ����");
	}
}
