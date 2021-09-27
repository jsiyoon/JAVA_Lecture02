package j210915_GenericTextbook;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
//		String str = Util2.compare("a", "b");//x String은 Number타입아님
		
		int result1 = Util2.compare(10,20); //int -> Integer자동형변환
		System.out.println(result1);
		
		int result2 = Util2.compare(4.5, 3); //double -> Double자동형변환
		System.out.println(result2);
	}
}
