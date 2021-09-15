package j210908_thows;

public class Example3ClassNotFoundException {
	public static void main(String[] args) {
		try {
			Class.forName("aaaa");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
