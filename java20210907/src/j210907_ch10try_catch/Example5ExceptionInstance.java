package j210907_ch10try_catch;

public class Example5ExceptionInstance {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		int[] arr = {3, 2, 6};
		
		try {
			System.out.println(arr[3]);			
		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("����ε��� �ƿ�����ٿ����ͼ��� �߻�");
			e.printStackTrace(); //������� --> ����ã�� �ӵ� �������� ����.
			
			System.out.println("�޽���:" + e.getMessage());
			System.out.println("����:" + e.getCause());
		}
		
		System.out.println("���α׷� ����");
	}
}
