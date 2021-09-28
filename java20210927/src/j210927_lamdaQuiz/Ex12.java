package j210927_lamdaQuiz;

import java.util.*;

public class Ex12 {
	public static void main(String[] args) {
		List<Car> list = Arrays.asList(new Car("testa", 5000), new Car("kia", 3000), new Car("volvo",200), new Car("fiat",400));
		
		list.sort((a,b) -> a.getPrice() - b.getPrice());
		list.forEach(c -> System.out.println(c.getModel() + ":" + c.getPrice()));
	}
}

class Car{
	private String model;
	private int price;
	
	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}