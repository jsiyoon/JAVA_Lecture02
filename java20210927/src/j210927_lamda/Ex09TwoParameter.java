package j210927_lamda;

public class Ex09TwoParameter {
	public static void main(String[] args) {
		MyInterface9 o1 = (int a, int b) -> {System.out.println(a+ ", " +b);}; 
		o1.method(3, 4);
		
		//�������̽� ������ Ÿ�� ���� �����Ƿ� ���� ����
		MyInterface9 o2 = (a,b) -> {System.out.println(a + ":" +b);};
		o2.method(1, 2);
		
//		MyInterface9 o3 = a,b -> System.out.println(a + ", "+b); //�Ķ���Ͱ� 1���� �ƴϹǷ� ()��ȣ �����ȵ�.
		
	}
}
interface MyInterface9{
	void method(int a, int b);
}