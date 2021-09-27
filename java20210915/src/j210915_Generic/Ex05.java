package j210915_Generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex05 {
	//제한된 타입 파라미터
	public static void main(String[] args) {
		Box2<ArrayList> b1;
		Box2<LinkedList> b2;
		Box2<List> b3;
		
//		Box2<Objext> b4; // x ->하위클래스는 정의할수 없음
//		Box2<HashSet> b5;// x
	}
}

class Box2<T extends List>{
	
}
