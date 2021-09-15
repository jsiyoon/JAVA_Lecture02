package j210915_TextBook;

import java.util.ArrayList;
import java.util.List;
//728p
public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("java"); //String객체저장
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database"); //2번째에 Database저장한다는 뜻
		list.add("iBATIS");
		list.add("iBATIS");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수:" + size); //5
		System.out.println();
		
		String skil1 = list.get(2); //2번인덱스 객체얻기
		System.out.println("2:" + skil1);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.remove(2); // Database삭제됨
		list.remove(2); // Servlet/JSP삭제됨
		list.remove("iBATIS"); // 3개의 iBATIS중 한개의 iBATIS만 삭제됨.
		list.removeIf(str -> str.equals("iBATIS")); // 모든 iBATIS삭제됨.
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}
