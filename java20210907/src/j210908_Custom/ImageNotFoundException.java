package j210908_Custom;

public class ImageNotFoundException extends RuntimeException{
	//1. RuntimeException (unchecked)
	//2. Exception(checked)
	
	//���� String message �Ķ���� �޴� ������ ����.
	
	public ImageNotFoundException() {
		
	}
	public ImageNotFoundException(String message) {
		super(message);
	}
}
