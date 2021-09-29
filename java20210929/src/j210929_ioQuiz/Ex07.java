package j210929_ioQuiz;

import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class Ex07 {
	public Map<Character, Integer> count(String fileName) throws Exception{
		Reader r = new FileReader(fileName);
		Map<Character,Integer> map = new HashMap<>();
		
		int n;
		while((n = r.read()) != -1) {
			if(map.containsKey((char)n)) {
				map.put((char)n, map.get((char)n)+1);
			}else {
				map.put((char)n, 1);
			}
		}
		
		r.close();		
		return map;
	}
}
