package j210913_Object.equals;

import java.util.HashSet;
import java.util.Set;

public class Ex04 {
	public static void main(String[] args) {
		Set<Car> set = new HashSet<>();
		
		set.add(new Car("model3", 2021));
		System.out.println(set.size());
		
		set.add(new Car("avante", 2000));
		System.out.println(set.size());
		
		set.add(new Car("model3", 2021));
		System.out.println(set.size());
	}
}

class Car {
	private String model;
	private int year;
	
	Car(String model, int year){
		this.model = model;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		Car o = (Car) obj;
		return model.equals(o.model) && year == o.year; //�ʵ尪�� ������ �ؽð��� ������ ��.
	}
	
	@Override
	public int hashCode() { //������ ���ڿ��� ��� ���� �ؽ��ڵ带 ����
		return model.hashCode() * 77 - year * 11; //field model, field year�� ������ ���� ������µ�.
	}
	
}
