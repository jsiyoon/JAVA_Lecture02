package j210910;

import java.util.regex.Pattern;

public class Q_PatternMatcherExample {
	public static void main(String[] args) {
		//ù����� ���ĺ����� �����ϰ� �� ��°���� ���ڿ� ���ĺ����� ������ 8��-12�� ���� ID�� �˻�.
		String id = "5Angel1004";
		String id2 = "a072298a8";
		String regExp = "[a-zA-Z]{1}.{7,11}";
		boolean isMatch = Pattern.matches(regExp, id2);
		if(isMatch) {
			System.out.println("ID�� ����� �� �ֽ��ϴ�.");
		}else {
			System.out.println("ID�� ����� �� �����ϴ�.");
		}
				
	}
}
