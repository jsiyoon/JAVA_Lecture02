package s210903_4static;

public class StaticEx05ClassInstanace {
	public static void main(String[] args) {
		Class05.method2();
//		Class05.method1(); �ν��Ͻ� ���� �ʿ�
		
		Class05 c1 = new Class05();
		c1.method1();
	}
}
class Class05{
	//�ν��Ͻ� �޼ҵ�,��� �޼ҵ�
	public void method1() {
		System.out.println("instance method");
	}
	//Ŭ���� �޼ҵ�, ����ƽ �޼ҵ�
	public static void method2() {
		System.out.println("Static method");
	}
}
