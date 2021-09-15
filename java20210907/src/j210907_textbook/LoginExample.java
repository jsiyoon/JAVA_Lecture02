package j210907_textbook;

public class LoginExample {
	public static void main(String[] args) {
		
		try {
			login("white", "12345");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws Exception{
		//id�� "blue"�� �ƴ϶�� NotExistIDException�߻�
		if(!id.equals("blue")) {
			throw new NotExistIDException("���̵� �������� �ʽ��ϴ�.");
		}
		
		//password�� "12345"�� �ƴ϶�� WrongPasswordException�߻�
		if(!password.equals("12345")) {
			
			throw new WrongPasswordException("�н����尡 Ʋ���ϴ�.");
		}
	}
}
