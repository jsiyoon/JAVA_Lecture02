package j210915_Collection_list;

public class Ex01Array {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		arr1[0] = 999;
		arr1[1] = 888;
		arr1[2] = 777;
		
		int[] arr2 = new int[6];
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
	}
}
