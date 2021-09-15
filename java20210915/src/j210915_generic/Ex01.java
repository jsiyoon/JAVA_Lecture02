package j210915_generic;

public class Ex01 {
	public static void main(String[] args) {
		Box<String> b = new Box<String>();
		Box<Integer> b2  = new Box<Integer>();
		
//		b.setItem(33); x
//		b2.setItem("java"); x
		
		b.setItem("java");
		b2.setItem(33);
		
		String s = b.getItem();
		Integer i = b2.getItem();
		
		System.out.println(s.length());
		System.out.println(i.intValue());
	}
}

class Box<T>{
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}	
