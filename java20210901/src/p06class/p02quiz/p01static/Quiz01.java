package p06class.p02quiz.p01static;

public class Quiz01 {
	public static void main(String[] args) {
		//���� ���̸� ���ϴ� �� �ϼ�
		//������ * ������ * PI
		double a1 = area(10);
		System.out.println(a1);
	}
	public static double area(double r) {
		return r * r * Math.PI;
	}
}
