package j210907_ch10exception_classes;

public class Example2_NullPointerException {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		Object o1 = null;
		method(o1);
		
		System.out.println("���α׷� ���� ����");
	}

	public static void method(Object o){
		o.hashCode(); //NullPointerException
	}
}
