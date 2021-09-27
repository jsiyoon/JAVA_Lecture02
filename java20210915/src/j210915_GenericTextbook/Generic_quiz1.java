package j210915_GenericTextbook;

public class Generic_quiz1 {
	//672p - 2¹ø
	public static void main(String[] args) {
		Container1<String> container1 = new Container1<String>();
		container1.set("È«±æµ¿");
		String str = container1.get();
		System.out.println(str);
		
		Container1<Integer> container2 = new Container1<Integer>();
		container2.set(6);
		int value = container2.get();
		System.out.println(value);
	}
	
	static class Container1<T>{
		private T item;
		
		public void set(T item) {
			this.item = item;
		}

		public T get() {
			return item;
		}
		
	}
}
