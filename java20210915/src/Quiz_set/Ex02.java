package Quiz_set;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	public Set<String> toSet(String[] str){
		Set<String> set = new HashSet<>();
		
		for(String item : str) {
			set.add(item);
		}
		return set;
	}
}
