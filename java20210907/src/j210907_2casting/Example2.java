package j210907_2casting;

import java.io.Serializable;

public class Example2 {
	public static void main(String[] args) {
		//����Ÿ������ ���� ����ȯ
		String str = "java";
		method(str);
		
		int[] arr = {1,2};
		method(arr);

		System.out.println("�ý�������");
		
	}
	
	public static void method(Object o) {
		//����Ÿ������ ���� ����ȯ
		String s = (String) o;
		Serializable se = (Serializable) o;
		Comparable<String> com = (Comparable<String>) o;
		CharSequence c = (CharSequence) o;
	}
}
