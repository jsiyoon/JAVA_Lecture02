package s210902;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//child변수 선언, 적절한 값 할당
		Child child = (Child)parent;
		
		
		child.method3();
	}
}
