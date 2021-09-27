package j210927_GenericWhildcard;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		//파라미터나 리턴타입에 작성됨.
		//확장은 선언변수보다 하위타입이면됨.(Integer는 Number의 하위타입)
		ArrayList<? extends Number> list1 = new ArrayList<Integer>();
		list1 = new ArrayList<Double>();
		list1 = new ArrayList<Long>();
		
//		list1 = new ArrayList<Object>();
//		list1 = new ArrayList<String>(); //Number보다 상위타입은 불가.
		
		//하위타입제한(super)
		ArrayList<? super Number> list2 = new ArrayList<Number>();
		list2 = new ArrayList<Object>();
		
//		list2 = new ArrayList<Integer>();
//		list2 = new ArrayList<Double>(); //Number보다 하위타입불가
		
		//제한없음
		ArrayList<?> list3 = new ArrayList<Integer>();
		list3 = new ArrayList<Number>();
		list3 = new ArrayList<String>();
		list3 = new ArrayList<Object>();
		
	}
}
