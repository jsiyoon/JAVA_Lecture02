package j210908_thows;

public class Example4 {
	public static void main(String[] args) throws Exception {
		System.out.println("���α׷�����");
		method1();
		System.out.println("���α׷� ����");
	}
	
	public static void method1() throws Exception {
		System.out.println("�޼ҵ�1 ����");
		method2();
		System.out.println("�޼ҵ�1 ����"); //method2�� throw�� ���� ������� ����.
	}
	public static void method2() throws Exception{
		System.out.println("�޼ҵ�2 ����");
		
		throw new Exception();
		
//		System.out.println("�޼ҵ�2 ����"); //throw�� ���� �ؿ� �ڵ� ������� ����.
	}
}
