package j210907_ch10try_catch;

public class Example1TryCatch_Array {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		int[] arr = {7, 2, 1};
		
		System.out.println(arr[0]);
		
		//ArrayIndexOutOfBoundsExcepiton�߻��� ���� �ذ� ���
		try {//exception�� �߻��� �� �ִ� �ڵ� ��
			System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			//ArrayIndexOutOfBoundsExceptio ��ü�� ������ �� ����Ǵ� ��
			System.out.println("����ε����ƿ�����ٿ����ͼ��� �߻�");
		}
		
		System.out.println("���α׷� ����");
	}
}
