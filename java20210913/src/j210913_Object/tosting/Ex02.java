package j210913_Object.tosting;

public class Ex02 {
	public static void main(String[] args) {
		Account a1 = new Account("111-111", "kim", 10000);
		System.out.println(a1.toString());
		
		Object o1 = a1;
		System.out.println(o1.toString());
		
		Account a2 = new Account("222-222", "lee", 20000);
		System.out.println(a2.toString());
	}
}
