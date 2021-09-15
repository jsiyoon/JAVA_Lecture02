package j210909_String;

public class Ex06IndexOf_Q {
	public static void main(String[] args) {
		
		//"공장"이라고 나오는 index들 출력
		String str = "간장 공장 공장장은 강 공장장이고 된장 공장 공장장은 공 공장장이다.";
		
//		System.out.println(str.indexOf("공장"));
//		System.out.println(str.indexOf("공장",5));
//		System.out.println(str.indexOf("공장",8));
//		System.out.println(str.indexOf("공장",15));
//		System.out.println(str.indexOf("공장",24));
//		System.out.println(str.lastIndexOf("공장"));
		
		String s = "공장";
		int i = 0 - s.length();
		
		boolean run = true;
		while(run) {
			i = str.indexOf(s, i + s.length()); //index 0부터 찾기 위해 i값은 0 - s.length() = -2부터 시작.
			
			if(i == -1) {
				break;
			}
			System.out.println(i);
		}
		
	}
}
