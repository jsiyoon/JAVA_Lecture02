package j210913_Object.hashcode;

public class Ex03 {
	public static void main(String[] args) {
		
		//���δٸ� ��ü�� ���� hashcode�� ������ �ִ�.
		//���� ��ü�� ���� hashcode������ ��.
		
		Book b1 = new Book();
		Book b2 = b1; //b1�� b2�� ���� ��ü�� ����Ŵ.
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1 == b2);
		
		Book b3 = new Book(); //b1�� b3�� �ٸ� ��ü�� ����Ŵ
		System.out.println(b3.hashCode());
		System.out.println(b1 == b3); //���� �ؽ��ڵ带 ������ �ٸ�.
		
	}
}

class Book {
	@Override
	public int hashCode() {
		return 300;
//		return (int) (Math.random() * 100); //������ü�� ���� ���� return�ؾ���. ���������� �ƴ�.
	}
}