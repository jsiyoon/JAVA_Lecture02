package j210907multiple_exception;

public class Example2_Nested {
	public static void main(String[] args) {
		String[] arr1 = {"java", "html"};
		
		try {
			System.out.println(arr1[2]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε��� ����");
		}finally{
			System.out.println("�� �����ؾ� �ϴ� �ڵ�");
			try {
				System.out.println(arr1[3]);				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("���̳θ���� ���� ĳġ��");
			}
		}
		
		System.out.println("���α׷� ����");
	}
}
