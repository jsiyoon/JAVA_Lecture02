package j210907_textbook;

public class WrongPasswordException extends Exception{
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);
	}
	public WrongPasswordException(Throwable cause) {
		super(cause);
	}
}
