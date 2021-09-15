package j210910;

import java.util.regex.Pattern;

public class Q_PatternMatcherExample {
	public static void main(String[] args) {
		//첫번재는 알파벳으로 시작하고 두 번째부터 숫자와 알파벳으로 구성된 8자-12자 사이 ID값 검사.
		String id = "5Angel1004";
		String id2 = "a072298a8";
		String regExp = "[a-zA-Z]{1}.{7,11}";
		boolean isMatch = Pattern.matches(regExp, id2);
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		}else {
			System.out.println("ID로 사용할 수 없습니다.");
		}
				
	}
}
