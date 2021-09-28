package j210927_lamda;

public class Ex06ZeroParameter {
	public static void main(String[] args) {
		MyInterface6 o1 = () -> System.out.println("hello");
		o1.method();
	}
}

interface MyInterface6{
	void method();
}