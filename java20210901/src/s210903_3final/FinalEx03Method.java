package s210903_3final;

public class FinalEx03Method {
	
}

class car2{
	public final void start() {
		System.out.println("출발!");
	}
}
class Tesla extends car2{
	//final메소드 start재정의 불가
//	public void start() {
//		System.out.println("테슬라 출발");
//	}
}

