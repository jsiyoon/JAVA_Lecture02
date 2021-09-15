package j210907_ch10exception_classes;

public class Example5_ClassCastException {
	public static void main(String[] args) {
		String str = "java";
		method(str);
	}
	public static void method(Object o) {
		Number n = (Number) o;
	}
}
