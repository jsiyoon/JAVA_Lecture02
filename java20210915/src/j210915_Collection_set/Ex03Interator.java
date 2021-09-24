package j210915_Collection_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex03Interator {
	public static void main(String[] args) {
		//p735
		//Iterator 열거자, 반복자
		//주요메소드 : hasNext(), next()
		
		Set<String> set = new HashSet<>();
		
		set.add("ironman");
		set.add("captain");
		set.add("spiderman");
		set.add("widow");
		set.add("hulk");
		
		Iterator<String> iterator = set.iterator();
		
		String e1 = iterator.next();
		String e2 = iterator.next();
		String e3 = iterator.next();
		String e4 = iterator.next();
		String e5 = iterator.next();
//		String e6 = iterator.next(); //NoSuchElementException발생	
		
		System.out.println(e1 + ","+ e2 + "," + e3 + "," + e4 + "," + e5);
		System.out.println("====================================");
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String i1 = iterator.next();
			System.out.println(i1);
		}
		
		System.out.println("====================================");
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("====List Iterator====");
		List<String> list = new ArrayList<>();
		list.add("suga");
		list.add("v");
		list.add("jimin");
		list.add("jin");
		list.add("rm");
		list.add("bts");
		list.add("bts");
		
		Iterator<String> iter = list.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
