package j210907_ch10try_catch;

public class Example1TryCatch_Array {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		int[] arr = {7, 2, 1};
		
		System.out.println(arr[0]);
		
		//ArrayIndexOutOfBoundsExcepiton발생시 오류 해결 방법
		try {//exception이 발생할 수 있는 코드 블럭
			System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			//ArrayIndexOutOfBoundsExceptio 객체가 잡혔을 때 실행되는 블럭
			System.out.println("어레이인덱스아웃오브바운즈익셉션 발생");
		}
		
		System.out.println("프로그램 종료");
	}
}
