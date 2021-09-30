package j210907_ch10try_catch;

public class Example5ExceptionInstance {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int[] arr = {3, 2, 6};
		
		try {
			System.out.println(arr[3]);			
		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("어레이인덱스아웃오브바운즈익셉션 발생");
			e.printStackTrace(); //예외출력 --> 버그찾는 속도 빨라질수 있음
			
			System.out.println("메시지 :" + e.getMessage());
			System.out.println("원인 :" + e.getCause());
		}
		
		System.out.println("프로그램 종료");
	}
}
