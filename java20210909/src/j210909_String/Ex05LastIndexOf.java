package j210909_String;

public class Ex05LastIndexOf {
	public static void main(String[] args) {
		String s1 = "java보다 javascript가 더 쉬웠어요";
		 //인덱스		 012345678910
		
		System.out.println(s1.indexOf("java"));
		System.out.println(s1.lastIndexOf("java")); //마지막으로 나오는 java글자의 첫번째 인덱스 출력
		System.out.println(s1.lastIndexOf("python")); //글자 없으니 -1return
		
	}
}
