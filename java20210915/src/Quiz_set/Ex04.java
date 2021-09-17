package Quiz_set;

import java.util.HashSet;
import java.util.Set;

public class Ex04 {
	public Set<String> dupSet(String[] str){
		Set<String> set = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		
		for(String item : str) {
			if(set2.contains(item)) {
				set.add(item);
			}else {
				set2.add(item);
			}
		}
		
		return set;
	}
}
