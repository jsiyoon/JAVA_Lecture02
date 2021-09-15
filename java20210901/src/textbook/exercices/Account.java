package textbook.exercices;

public class Account {
	private final static int MAX_BALACE = 1000000;
	private final static int MIN_BALACE = 0;
	private int Balance;

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		if(balance >= MIN_BALACE && balance < MAX_BALACE) {			
			Balance = balance;
		}
	}
	
}
