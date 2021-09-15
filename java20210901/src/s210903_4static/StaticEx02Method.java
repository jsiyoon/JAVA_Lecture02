package s210903_4static;

public class StaticEx02Method {
	public static void main(String[] args) {
		//static method02는 인스턴스 생성없이 method02바로 사용.
		Class02.method02();
		System.out.println(Math.random());
		
		//인스턴스 만들어 주고 실행해주는 method01
		Class02 c1 = new Class02();
		c1.method01();
	}
}

class Class02{
	//static method,정적메소드,클래스 메소드
	
	//인스턴스 만들어서 실행해야하는 메소드
	void method01() {
		System.out.println("인스턴스 메소드");
	}
	//static method02는 static method로 인스턴스 생성 필요없음.
	static void method02() {
		System.out.println("스태틱 메소드");
	}
}
