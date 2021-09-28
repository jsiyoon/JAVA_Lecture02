package j210927_lamda;

public class Ex09TwoParameter {
	public static void main(String[] args) {
		MyInterface9 o1 = (int a, int b) -> {System.out.println(a+ ", " +b);}; 
		o1.method(3, 4);
		
		//인터페이스 내에서 타입 정의 했으므로 생략 가능
		MyInterface9 o2 = (a,b) -> {System.out.println(a + ":" +b);};
		o2.method(1, 2);
		
//		MyInterface9 o3 = a,b -> System.out.println(a + ", "+b); //파라미터가 1개가 아니므로 ()괄호 생략안됨.
		
	}
}
interface MyInterface9{
	void method(int a, int b);
}