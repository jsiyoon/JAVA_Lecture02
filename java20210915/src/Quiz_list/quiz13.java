package Quiz_list;

import java.util.ArrayList;

public class quiz13 {
	public static void main(String[] args) {
		//1~45»çÀÌ °ª 6°³ ·£´ý
		//Math.random()
		
		ArrayList<Integer> lotto = new ArrayList();
		
		while(lotto.size() < 6) {
			int ran = (int) (Math.random() *45) + 1;
			if(!lotto.contains(ran)) {
				lotto.add(ran);
			}
		}
		
		for(int l : lotto) {
			System.out.println(l); //6°³ ·£´ý
		}
	}
}
