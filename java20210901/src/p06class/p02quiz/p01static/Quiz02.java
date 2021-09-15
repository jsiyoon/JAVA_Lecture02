package p06class.p02quiz.p01static;

public class Quiz02 {
	public static void main(String[] args) {
		//정수(int)로 표현할 수 있는 최대 양수값
		//					    최소값
		//을 api에서 Integer클래스 찾아서
		//관련된 필드를 사용해서 출력
		int a = Integer.MAX_VALUE;
		int b = Integer.MIN_VALUE;
		System.out.println("최대값:" + a + ", 최소값:" + b);
		
		//정수(long)최대값, 최소값
		System.out.println("long형 최대값:" + Long.MAX_VALUE);
		System.out.println("long형 최소값:" + Long.MIN_VALUE);
	}
}
