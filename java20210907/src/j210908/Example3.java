package j210908;

public class Example3 {
	public static void main(String[] args) {
		
		//�Ϲݿ���(Checked Exception)
		//Exception�� Runtime Exception��� ���� ���� ��
		try {			
			throw new Exception();
		}catch(Exception e) {
			System.out.println("�ͼ��� �߻�");
		}
		
		//���࿹��(unchecked Exception)
		//Exception�� Runtime Exception��� ���� ��
		
		throw new RuntimeException();
	}
}

//return : 1. �޼ҵ� ����, 2. ������ �� ��ȯ -> ���� �̾

//throw : ���ܰ�ü throw -> catch�� ������ ó���ؾ���(���α׷� ����/���� ���)