package j210909_String;

public class Ex06IndexOf_Q {
	public static void main(String[] args) {
		
		//"����"�̶�� ������ index�� ���
		String str = "���� ���� �������� �� �������̰� ���� ���� �������� �� �������̴�.";
		
//		System.out.println(str.indexOf("����"));
//		System.out.println(str.indexOf("����",5));
//		System.out.println(str.indexOf("����",8));
//		System.out.println(str.indexOf("����",15));
//		System.out.println(str.indexOf("����",24));
//		System.out.println(str.lastIndexOf("����"));
		
		String s = "����";
		int i = 0 - s.length();
		
		boolean run = true;
		while(run) {
			i = str.indexOf(s, i + s.length()); //index 0���� ã�� ���� i���� 0 - s.length() = -2���� ����.
			
			if(i == -1) {
				break;
			}
			System.out.println(i);
		}
		
	}
}
