package j210927_lamdaQuiz;

import java.util.Arrays;
import java.util.List;

public class Ex05 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,4,5,6);
		
		list.forEach(i -> System.out.print(i*2 + " "));
	}
}
