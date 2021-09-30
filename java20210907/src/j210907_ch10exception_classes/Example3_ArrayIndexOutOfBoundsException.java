package j210907_ch10exception_classes;

public class Example3_ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		int[] arr = {3, 1, 6};
		
		//ArrayIndexOutofBoundsException
		for(int i = 0 ; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("프로그램 종료");
	}
}
