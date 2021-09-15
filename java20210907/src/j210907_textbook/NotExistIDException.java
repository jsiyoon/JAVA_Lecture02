package j210907_textbook;

public class NotExistIDException extends Exception{
	
	//일반예외(checked exception)
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message);
	}
	public NotExistIDException(Throwable cause) {
		super(cause);
	}
}
