package j210907_3annonymous;

public class Example2 {
	public static void main(String[] args) {
		
		//Ŭ�����ۼ� , ��ü ���� ����
		// ���� Ŭ������ �߻� �޼ҵ带 �� ������!
		MyInterface2 i1 = new MyInterface2() {

			@Override
			public void method1() {
				System.out.println("���� Ŭ������ �޼ҵ�1");
			}
		};
		i1.method1();
	}
}
