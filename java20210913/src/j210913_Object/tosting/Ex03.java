package j210913_Object.tosting;

public class Ex03 {
	public static void main(String[] args) {
		Account a1 = new Account("333-333", "son", 30000);
		
		System.out.println(a1.toString());
		System.out.println(a1);
		System.out.println(String.valueOf(a1));
	}
}
