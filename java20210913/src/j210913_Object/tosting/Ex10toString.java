package j210913_Object.tosting;

public class Ex10toString {
	public static void main(String[] args) {
		Car car1 = new Car("kia", 1000);
		
		System.out.println(car1.toString());
		
		Car car2 = new Car("tesla", 15000);
		
		System.out.println(car2.toString());
		
		car1.setPrice(20000);
		
		System.out.println(car1.toString());
		
		/*
		 * ��°��
		 * ȸ�� : kia, ����: 10000��
		 * ȸ�� : tesla, ���� : 15000��
		 * ȸ�� : kia , ���� : 20000��*/
	}
}
