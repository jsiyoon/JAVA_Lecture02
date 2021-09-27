package j210927_lamdaQuiz;

public class Ex01 {
	public static void main(String[] args) {
		MyInterface1 o1 = () ->{
			for(int i =1; i<=5; i++) {
				System.out.println(i);
			}
		};
		
		o1.method();
		
	}
}
interface MyInterface1{
	public void method();
}