package j210927_lamda;

public class Ex01Anonymous {
	public static void main(String[] args) {
		MyInterface1 o1;
		o1 = new MyClass1(); //��ü����
		
		//Interface������ ��ü���� �ѹ���
		MyInterface1 o2 = new MyInterface1() {
			@Override
			public void method1() {
			}
			@Override
			public void mehtod2() {
			}
		};
	}
}

interface MyInterface1{
	public void method1();
	public void mehtod2();
}
class MyClass1 implements MyInterface1{
	//interface����

	//�߻�޼ҵ� ������
	@Override
	public void method1() {
	}
	@Override
	public void mehtod2() {
	}
}
