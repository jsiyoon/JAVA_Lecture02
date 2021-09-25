package j210915_Collection_map;

import java.util.HashMap;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		//MAP
		//Key : value������ ����
		
		HashMap<Integer, Integer> map;
		map = new HashMap();
		
		//put : key:value�� �߰�
		map.put(100, 300);
		map.put(500, 3000);
		
		//size : map�� ũ��
		System.out.println(map.size());
		
		//get : key�� value���
		Integer v1 = map.get(100);
		System.out.println(v1);
		System.out.println(map.get(500));
		System.out.println(map.get(6000)); //���� Ű�� null����
		
		//put : �̹� �ִ� Key�� Value�߰� -> ���
		map.put(500, 7000);
		System.out.println(map.get(500));
		System.out.println(map.size()); //������ ������ ����
		
		//keySet : Key ����(set)����
		System.out.println("===Keys===");
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			System.out.println(key);
		}
		
		//��ü key:value��(entry)Ž��
		//1. key set���
		//2. key�� valueŽ��
		System.out.println("===Ž��1===");
		keys = map.keySet(); //1. key set���
		for(Integer key : keys) { //2. key�� valueŽ��
			System.out.println(key + ":" + map.get(key));
		}
	}
}
