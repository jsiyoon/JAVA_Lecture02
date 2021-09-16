package Quiz;

public class quiz05 {
	public int sum(String str) {
		// str: "3 4"
		// return: 7
		int s = str.indexOf(" ");
		
		int a = Integer.parseInt(str.substring(0,s));
		int b = Integer.parseInt(str.substring(s+1));
		
//		String[] nums = str.split(" ");
//		
//		int a = Integer.parseInt(nums[0]);
//	    int b = Integer.parseInt(nums[1]);

		return a+b;
	}
}
