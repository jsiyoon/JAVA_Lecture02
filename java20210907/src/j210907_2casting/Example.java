package j210907_2casting;

import java.io.Serializable;

public class Example {
	public static void main(String[] args) {
		//����Ÿ������ �ڵ� ����ȯ
		String str = "java";
		
		Object o = str;
		Serializable s = str;
		CharSequence c = str;
		Comparable<String> com = str;
	}
}
