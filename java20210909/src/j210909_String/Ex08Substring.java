package j210909_String;

public class Ex08Substring {
	public static void main(String[] args) {
		String s1 = "javascript";
		
		String sub1 = s1.substring(4); //4�� �ε������� ������ ����
		System.out.println(sub1);
		
		String sub2 = s1.substring(0,4); //0~3�ε������� �κ� ���ڿ� ����
		System.out.println(sub2);		 //0���� 4������, 4��°�� ������ �ȵ�.
	}
}
