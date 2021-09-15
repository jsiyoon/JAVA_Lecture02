package j210915_notgeneric;

public class Ex01 {
	public static void main(String[] args) {
		Box b = new Box();
		b.setItem("java");
		String s = (String)b.getItem();
		
		System.out.println("아이템 길이:" + s.length());
		
		b.setItem(3); //Integer로 auto_boxing됨.
		
		Integer i = (Integer)b.getItem();
		System.out.println("아이템 값:" + i);
		
		b.setItem("html");
		Integer i2 = (Integer)b.getItem(); //ClassCastException발생
	}
}

class Box{
	private Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
}
