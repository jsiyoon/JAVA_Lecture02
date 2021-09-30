package j210907multiple_exception;

public class Example2_Nested {
	public static void main(String[] args) {
		String[] arr1 = {"java", "html"};
		
		try {
			System.out.println(arr1[2]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 오버");
		}finally{
			System.out.println("꼭 실행해야 하는 코드");
			try {
				System.out.println(arr1[3]);				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("파이널리 블록 안쪽 캐치");
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
