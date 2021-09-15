package j210914_p12Thread;

public class Ex01 {
	public static void main(String[] args) {
		OtherThread t1 = new OtherThread();
		t1.start(); //thread에서 start메서드 이미 정의되어있어 사용가능함.
		
		System.out.println("프로그램 시작");
		for(int i =0; i < 10000; i++) {
			System.out.println(i);
		}
		
		System.out.println("프로그램 종료");
		
		
	}
}

//Thread클래스 활용
class OtherThread extends Thread{
	@Override
	public void run() {//우리가 재정의 해야하는 메소드
		System.out.println("다른 스레드 시작");
		for(int i = 10000_0000; i < 10001_0000; i++) {
			System.out.println(i);
		}
		System.out.println("다른 스레드 종료");
	}
}