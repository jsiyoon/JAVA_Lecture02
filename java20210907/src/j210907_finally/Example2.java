package j210907_finally;

public class Example2 {
	public static void main(String[] args) {

		int[] arr = { 3, 3, 0 };
		try {

			for (int n : arr) {
				if (n == 0) {
					System.out.println("n이 0이어서 종료");
					return; // 1. 값 반환, 2. 메소드 종료
				}
			}
		} finally { // finally는 무슨 문장이 실행되어도 무조건 실행됨.
			System.out.println("무조건 실행");
		}
		System.out.println("프로그램 종료"); // 위에서 리턴 키워드 만났음으로 뒤에 문장 실행 하지 않음
	}
}
