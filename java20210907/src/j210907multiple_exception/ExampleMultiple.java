package j210907multiple_exception;

public class ExampleMultiple {
	public static void main(String[] args) {
		String[] arr = {"1", "a"};
		
		try {
			int i = Integer.parseInt(arr[1]);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
			System.out.println("ÀÍ¼Á¼Ç ¹ß»ý");
		}
	}
}
