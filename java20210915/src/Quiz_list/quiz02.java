package Quiz_list;

import java.util.*;

public class quiz02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.print("0:종료, 1:출력, 2:삭제, 3:합계와 평균, 점수(50이상)>");
			int score = scan.nextInt();
			switch(score) {
			case 0:
				run = false;
				break;
			case 1:
//				for(int arr : list) {
//					System.out.println(arr);
//				}
				for(int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				break;
			case 2:
				if(list.size() > 0) {
					list.remove(list.size()-1);
				}
				break;
			case 3:
				int sum = 0;
//				int max = list.get(0), min = list.get(0);
				if(list.size() >= 0) {
					for(int i = 0; i < list.size(); i++) {
						sum += list.get(i);
						
//						if(max < list.get(i)) {
//							max = list.get(i);
//						}
//						if(min > list.get(i)) {
//							min = list.get(i);
						}
				}
				double avg = sum /(double)list.size();
				System.out.println("합:"+ sum);
				System.out.println("평균:" + avg);

				int max = max(list);
				int min = min(list);
				System.out.println("최대:" + max);
				System.out.println("최소:" + min);
				break;
			default:
				if(score >= 50) {
					list.add(score);
				}
				break;
			}
		}
		scan.close();
	}

	private static int max(ArrayList<Integer> list) {
		if(list.isEmpty()) {
			return 0;
		}
		int max = list.get(0);
		
		for(int i = 1; i < list.size(); i++) {
			if(max < list.get(i)) {
				max = list.get(i);
			}
		}
		return max;
	}
	private static int min(ArrayList<Integer> list) {
		if(list.isEmpty()) {
			return 0;
		}
		int min = list.get(0);
		
		for(int i = 1; i < list.size(); i++) {
			if(min > list.get(i)) {
				min = list.get(i);
			}
		}
		return min;
	}
}
