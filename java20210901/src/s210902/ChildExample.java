package s210902;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//child���� ����, ������ �� �Ҵ�
		Child child = (Child)parent;
		
		
		child.method3();
	}
}
