package j210927_lamda;

public class Ex02Annoymous {
	public static void main(String[] args) {
		MyInterface2 o1 = new MyInterface2() {
			@Override
			public void method() {
				System.out.println("�����ڵ�1");
			}
		};
		
		//lamda
		MyInterface2 o2 = () ->{ //() : �Ķ����, -> : lamda��ȣ
			System.out.println("�����ڵ�2");
		};
		
		o1.method();
		o2.method();
	}
}

interface MyInterface2 {
	public void method();//�߻�޼ҵ尡 �� �ϳ�!
	
}