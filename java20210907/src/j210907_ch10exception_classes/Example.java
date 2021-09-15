package j210907_ch10exception_classes;

public class Example {
	public static void main(String[] args) {
		NullPointerException npe = new NullPointerException();
		
		System.out.println(npe instanceof NullPointerException);
		System.out.println(npe instanceof RuntimeException);
		System.out.println(npe instanceof Exception);
		System.out.println(npe instanceof Throwable);
		System.out.println(npe instanceof Object);
	}
}
