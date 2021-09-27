package j210915_GenericTextbook;

public class Generic_quiz2 {
//672p - 3¹ø
	public static void main(String[] args) {
		Container2<String, String> container1 = new Container2<String,String>();
		container1.set("È«±æµ¿", "µµÀû");
		String name = container1.getKey();
		String job = container1.getValue();
		System.out.println(name + ", "+ job);
		
		Container2<String, Integer> container2 = new Container2<String, Integer>();
		container2.set("È«±æµ¿", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		System.out.println(name2 + ", "+ age);
	}
	
	static class Container2<T,M>{
		private T key;
		private M value;

		public void set(T key, M value) {
			this.key = key;
			this.value = value;
		}

		public T getKey() {
			return key;
		}
		
		public M getValue() {
			return value;
		}
	}
}
