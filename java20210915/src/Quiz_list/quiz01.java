package Quiz_list;

import java.util.*;
public class quiz01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.print("l:list, e:exit ют╥б>");
			String s = scan.next();
		
			switch(s) {
			case "l" : 
				for(String str : list) {
					System.out.println(str);
				}
				break;
			case "e" : 
				run = false;
				break;
			case "r":
				if(list.size() > 0) {
					list.remove(list.size()-1);
					break;
				}
			default :
				list.add(s);
				break;
			}
		}
		scan.close();
	}
}
