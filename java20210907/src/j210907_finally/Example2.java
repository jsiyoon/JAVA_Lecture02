package j210907_finally;

public class Example2 {
	public static void main(String[] args) {

		int[] arr = { 3, 3, 0 };
		try {

			for (int n : arr) {
				if (n == 0) {
					System.out.println("n�� 0�̾ ����");
					return; // 1. �� ��ȯ, 2. �޼ҵ� ����
				}
			}
		} finally { // finally�� ���� ������ ����Ǿ ������ �����.
			System.out.println("������ ����");
		}
		System.out.println("���α׷� ����"); // ������ ���� Ű���� ���������� �ڿ� ���� ���� ���� ����
	}
}
