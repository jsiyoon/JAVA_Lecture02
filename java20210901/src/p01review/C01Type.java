package p01review;

public class C01Type {
	public static void main(String[] args) {
		//������Ÿ��
		//1.�⺻Ÿ��(primitive type)
		// -8��
		//byte(1), short(2), int(4), long(8)
		//float(4), double(8)
		//char(2)
		//boolean(1)
		int i = 4;
		int j = i;
		
		//2. ����Ÿ��(reference type)
		//������ ���
		int[] arr = {3,4};
		int[] brr = arr;
		brr[0] = 33;
	}
}
