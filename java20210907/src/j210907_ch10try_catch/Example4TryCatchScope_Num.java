package j210907_ch10try_catch;

public class Example4TryCatchScope_Num {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		String str = "10aa0";
		
		int n = 0;
		try {
			n = Integer.parseInt(str);
		}catch(NumberFormatException e) {
			System.out.println("�ѹ������ͼ��� �߻�");
		}
		System.out.println(n*2);
		
		System.out.println("�ý�������");
		
	}
}
