package j210907_textbook;

public class NotExistIDException extends Exception{
	
	//�Ϲݿ���(checked exception)
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message);
	}
	public NotExistIDException(Throwable cause) {
		super(cause);
	}
}
