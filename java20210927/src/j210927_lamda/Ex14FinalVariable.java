package j210927_lamda;

import java.util.*;

public class Ex14FinalVariable {
	public static void main(String[] args) {
		
		final int a = 3; //final은 값을 1번만 할당받을 수 있게함.
//		a = 4; // a의 값 재할당 불가.
		int sum = 0;
		List<Integer> list = Arrays.asList(3,4,5);
//		list.forEach(e -> sum += e); //지역변수를 변경할 수 없음.
									 //사용하는 지역변수는 final이어야 함
									 //final아니면 final로 간주함.
		list.forEach(e -> System.out.println(sum)); //사용은 가능
	}
}
