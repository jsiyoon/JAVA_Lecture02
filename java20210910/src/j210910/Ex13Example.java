package j210910;

public class Ex13Example {
	public static void main(String[] args) {
		String str = "pizza�� �޺���̼� pizza";
		
		String rep = str.replaceAll("[pP]izza", "����");
		
		System.out.println(rep);
	}
}
