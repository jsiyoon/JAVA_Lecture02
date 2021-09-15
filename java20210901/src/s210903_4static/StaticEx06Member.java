package s210903_4static;

public class StaticEx06Member {
	//스태틱(클래스)멤버(메소드, 필드)에서는
	//인스턴스 멤버(메소드,필드)접근 불가
	public int val1; //인스턴스 멤버
	public static int val2 ; //스태틱멤버
	
	public void method1() { //인스턴스 메서드
		System.out.println(val1);
		System.out.println(val2);
	}
	public static void method2() { //스태틱 메서드
//		System.out.println(val1); //static메서드에서 인스턴스 멤버 접근불가.
		System.out.println(val2);
	}
}
