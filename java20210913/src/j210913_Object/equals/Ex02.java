package j210913_Object.equals;

public class Ex02 {
	public static void main(String[] args) {
		Book b1 = new Book("자바다", "신");
		Book b2 = new Book("파이썬", "손");
		Book b3 = new Book("파이썬", "손");
		
		System.out.println(b1 == b2);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1.equals(b2));
		
		System.out.println("----------------");
		
		System.out.println(b2 == b3);
		System.out.println(b2.hashCode()); //같은 값
		System.out.println(b3.hashCode()); //같은 값
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
		return title.hashCode() + writer.hashCode(); //field title과 field writer같으면 같은 hashcocde 생성
	}

	@Override
	public boolean equals(Object obj) { //제목과 저자가 같을때 동일한 해시코드 값 같은 값을 같도록 함.
		Book otherBook = (Book) obj;
		return title.equals(otherBook.title) && writer.equals(otherBook.writer);
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", writer=" + writer + "]";
	}
	
}
