package j210914_wrap_boxing;

public class Ex05 {
	public static void main(String[] args) {
		int i1 = 300;
		Integer i2 = 300;
		
		//i1 = null; //x
		i2 = null;
		
		short s1 = 100; //2byte
		Short s2 = 100;
		
		i1 = s1;
//		i2 = s2;
//		i2 = (Integer) s2; //short->integer변경불가
		i2 = s2.intValue();
		
		int i3 = i2 + 100;
		System.out.println(i3);
		
		Object o1 = i2;
		i2 = (Integer) o1;
	}
}
