package j210907_ch10try_catch;

public class Example3TryCatch_Num {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		String str = "10a0";
		
		//NumberFormatException �ذ���
		try { //Exception�߻��� try���� ���� ��ɹ� ���� x
			int n1 = Integer.parseInt(str);
			System.out.println(n1*2);
		}catch(NumberFormatException e) {
			System.out.println("�ѹ������ͼ��� �߻�");
		}
		
		System.out.println("���α׷� ����");
	}
}
