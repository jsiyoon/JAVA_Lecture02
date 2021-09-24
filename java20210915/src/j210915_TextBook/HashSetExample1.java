package j210915_TextBook;

import java.util.*;
public class HashSetExample1 {
	//p737
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); //Java는 한번만 저장됨.
		set.add("iBATIS");
		
		int size = set.size(); //저장된 객체 수 얻기
		System.out.println("총 객체수:" + size);
		
		Iterator<String> iterator = set.iterator();//반복자 얻기
		while(iterator.hasNext()) { //객체수만큼 루핑
			String element = iterator.next();//한개의 객체 가져옴.
			System.out.println("\t" + element);
		}
		set.remove("JDBC");
		set.remove("iBATIS");//객체 삭제
		
		System.out.println("총 객체수:" + set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.clear();
		if(set.isEmpty()) {System.out.println("비어있음.");
		}
	}
}
