package j210913_Object.hashcode;

public class Ex03 {
	public static void main(String[] args) {
		
		//서로다른 객체가 같은 hashcode를 가질수 있다.
		//같은 객체면 같은 hashcode가져야 함.
		
		Book b1 = new Book();
		Book b2 = b1; //b1과 b2는 같은 객체를 가리킴.
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1 == b2);
		
		Book b3 = new Book(); //b1과 b3는 다른 객체를 가리킴
		System.out.println(b3.hashCode());
		System.out.println(b1 == b3); //같은 해시코드를 갖지만 다름.
		
	}
}

class Book {
	@Override
	public int hashCode() {
		return 300;
//		return (int) (Math.random() * 100); //같은객체는 같은 값을 return해야함. 문법오류는 아님.
	}
}