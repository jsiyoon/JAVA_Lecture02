package j210907_ch10try_catch;

public class Example1TryCatch_Array {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		int[] arr = {7, 2, 1};
		
		System.out.println(arr[0]);
		
		//ArrayIndexOutOfBoundsExcepiton발생시 오류 해결방법
		try {//exception발생할 수 있는 코드블럭
			System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			//ArrayIndexOutOfBoundsException 잡혔을때 실행.
			System.out.println("어레이인덱스아웃오브바운즈익셉션");
		}
		
		System.out.println("프로그램 종료");
	}
}
