package s210903_4static;

public class StaticEx04ClassInstance {
	public static void main(String[] args) {
		Class04.value2 = 10000;
//		Class04.value1 = 20000; 인스턴스 있어야만 가능
		
		Class04 c1 = new Class04();
		c1.value1 = 20000;
		System.out.println(c1.value1);

		Class04 c2 = new Class04();
		c2.value1 = 10000;
		System.out.println(c2.value1);
		
		System.out.println(Class04.value2);
		
		System.out.println(c1.value2);
		System.out.println(c2.value2);
	}
}
class Class04{
	//인스턴스변수, 인스턴스필드, 멤버변수
	public int value1;
	//스태틱변수, 클래스 변수, 클래스 필드, 클래스 멤버변수
	public static int value2;
	
}