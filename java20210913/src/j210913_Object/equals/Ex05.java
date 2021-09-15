package j210913_Object.equals;

import java.util.HashSet;
import java.util.Set;

public class Ex05 {
	public static void main(String[] args) {
		Person p1 = new Person("3","son");
		Person p2 = new Person("13","ji");
		Person p3 = new Person("3", "son");
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode()); //p1과 p3는 동일한 값을 가지고 있기에 동일한 해시값 출력됨.
		
		System.out.println(p1 == p3); //내용물은 같지만 실제로 같은 값은 아님.
									 //저장소를 비교한것 --> 실제 저장소는 같지 않다는 뜻
		System.out.println(p1.equals(p3)); //저장되어있는 값을 비교한것
		
		Set<Person> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		System.out.println(set.size());
	}
}

class Person{
	private String no;
	private String name;
	
	public Person(String no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((no == null) ? 0 : no.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no == null) {
			if (other.no != null)
				return false;
		} else if (!no.equals(other.no))
			return false;
		return true;
	}
	
	
}