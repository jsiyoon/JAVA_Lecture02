package j210909_String;

public class Ex08Substring {
	public static void main(String[] args) {
		String s1 = "javascript";
		
		String sub1 = s1.substring(4); //4번 인덱스부터 끝까지 리턴
		System.out.println(sub1);
		
		String sub2 = s1.substring(0,4); //0~3인덱스까지 부분 문자열 리턴
		System.out.println(sub2);		 //0부터 4이지만, 4번째는 포함이 안됨.
	}
}
