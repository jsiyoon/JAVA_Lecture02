package j210913_Object.equals;

public class Ex01 {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o1 == o2);
		
		String s1 = new String("java");
		String s2 = new String("java");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2)); //내용물 같아 같고
		
		System.out.println("s1 hashcode:" + s1.hashCode()); //내용물이 같아 해시값도 같음
		System.out.println("s2 hashcode:" + s2.hashCode());
		
	}
}
