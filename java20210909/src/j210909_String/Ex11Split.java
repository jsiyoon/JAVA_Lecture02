package j210909_String;

public class Ex11Split {
	public static void main(String[] args) {
		String s1 = "java,html,css,spring,jsp";
		
		String[] arr1 = s1.split(",");
		
		for(String item : arr1) {
			System.out.println(item);
		}
		
		System.out.println("====================");
		
		String s2 = "bts jin rm v jk suga jimin jhope";
		
		String[] arr2 = s2.split(" ");
		
		for(String item : arr2) {
			System.out.println(item);
		}
	}
}
