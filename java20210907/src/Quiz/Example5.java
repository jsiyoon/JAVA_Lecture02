package Quiz;

import java.io.FileNotFoundException;

public class Example5 {
	public static void main(String[] args) {
		//�Ϲݿ���(checked Exception)�߻���Ű�� �ڵ� �ۼ�
//		try {
//			throw new Exception();			
//		}catch(Exception e) {
//			System.out.println("�ͼ��� �߻�");
//		}
		
		try {
			throw new FileNotFoundException();
		}
		catch(FileNotFoundException e){
			System.out.println("���� �� ã��.");
		}
	}
}
