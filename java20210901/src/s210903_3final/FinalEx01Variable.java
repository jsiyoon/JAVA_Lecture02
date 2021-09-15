package s210903_3final;

public class FinalEx01Variable {
	public static void main(String[] args) {
		//변수에 final값 할당 받는 기회 단 한번
		final int var1 = 100;
		System.out.println(var1);
		
//		var1 = 10; //final로 인해 값 할당 하지 못함.
		System.out.println(var1);
		
		method02(3);
		method02(33);
	}
	public static void method02(final int param) {
//		param = 5;
		System.out.println(param);
	}
}
