package j210907_ch10try_catch;

public class Example2TryCatch_Null {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		method1(null);			
		
		System.out.println("���α׷� ����");
	}
	
	public static void method1(Object o) {
		
		//NullPointerException �ذ���
		try {			
			System.out.println(o.hashCode());
		}catch(NullPointerException e){
			System.out.println("�� ������ �ͼ��� �����Դϴ�.");
		}
	}
}
