package j210913_Object.equals;

public class Ex02 {
	public static void main(String[] args) {
		Book b1 = new Book("�ڹٴ�", "��");
		Book b2 = new Book("���̽�", "��");
		Book b3 = new Book("���̽�", "��");
		
		System.out.println(b1 == b2);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1.equals(b2));
		
		System.out.println("----------------");
		
		System.out.println(b2 == b3);
		System.out.println(b2.hashCode()); //���� ��
		System.out.println(b3.hashCode()); //���� ��
		System.out.println(b2.equals(b3)); //true
	}
}

class Book{
	private String title;
	private String writer;
	
	Book(String title, String writer){
		this.title = title;
		this.writer = writer;
	}

	@Override
	public int hashCode() {
		return title.hashCode() + writer.hashCode(); //field title�� field writer������ ���� hashcocde ����
	}

	@Override
	public boolean equals(Object obj) { //����� ���ڰ� ������ ������ �ؽ��ڵ� �� ���� ���� ������ ��.
		Book otherBook = (Book) obj;
		return title.equals(otherBook.title) && writer.equals(otherBook.writer);
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", writer=" + writer + "]";
	}
	
}
