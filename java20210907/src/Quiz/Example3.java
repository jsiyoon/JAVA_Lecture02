package Quiz;

public class Example3 {
	public static void main(String[] args) {
		//ArrayIndexOutOfBoundsException발생코드
		
		String arr[] = {"100", "200", "string"};
		
		System.out.println(arr[3]);
		
		throw new ArrayIndexOutOfBoundsException();
		
	}
}
