package j210907_finally;

public class Example {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		try {
			String[] arr = {"java", "python", "c"};
			
			System.out.println(arr[3]);
			
			System.out.println("Ʈ���� ��� ����");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ͼ��� �߻�");
			
			System.out.println("�ͼ��� �� ����");
		}finally {//������ ����Ǵ� finally			
			System.out.println("�� ����Ǿ�� �ϴ� �ڵ�");
		}
		System.out.println("���α׷� ����");
	}
}
