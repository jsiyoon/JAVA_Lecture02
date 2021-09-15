package j210915_generic;

import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		Container<String, Integer> c1;
		c1 = new Container<String, Integer>();
		
		c1.setItem("html");
		c1.setItem2(333);
		String s = c1.getItem();
		Integer i1 = c1.getItem2();
		
		System.out.println(s + "," + i1);
		
//		Container<Double, int[]> c2= new Container<Double, int[]>();
		Container<Double, int[]> c2 = new Container<>();
		c2.setItem(3.14);
		c2.setItem2(new int[] {1,2,3});
		
		Double d = c2.getItem();
		int[] arr = c2.getItem2();
		
		System.out.println(d);
		System.out.println(Arrays.toString(arr));
		
		Container<List<List<String>>, Map<String, Integer>> c3 = new Container<>();
		Container<? extends Number, Object> c4 = new Container<>();
	}
}

class Container <T,U>{
	private T item;
	private U item2;
	
	Container(){
		
	}
	
	Container(T item, U item2){
		this.item = item;
		this.item2 = item2;
	}
	
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	public U getItem2() {
		return item2;
	}
	public void setItem2(U item2) {
		this.item2 = item2;
	}
}