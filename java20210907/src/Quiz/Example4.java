package Quiz;

public class Example4 {
	public static void main(String[] args) {
		//ClassCastException�߻� �ڵ�
		Object o = "java";
		
		String s = (String) o;
//		Number n =(Number) o;
		
		System.out.println("���α׷� ����");
		
		throw new ClassCastException();
		
	}
}
