package j210908;

public class Example3 {
	public static void main(String[] args) {
		
		//일반예외(Checked Exception)
		//Exception중 Runtime Exception상속 받지 않은 것
		try {			
			throw new Exception();
		}catch(Exception e) {
			System.out.println("익셉션 발생");
		}
		
		//실행예외(unchecked Exception)
		//Exception중 Runtime Exception상속 받은 것
		
		throw new RuntimeException();
	}
}

//return : 1. 메소드 종료, 2. 오른쪽 값 반환 -> 실행 이어감

//throw : 예외객체 throw -> catch한 곳에서 처리해야함(프로그램 종료/실행 계속)