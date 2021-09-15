package textbook.exercices;

import java.util.Scanner;

public class BankApplication {
	private static Account2[] accountArray = new Account2[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}
			else if(selectNo == 2) {
				accountList();
			}
			else if(selectNo == 3) {
				deposit();
			}
			else if(selectNo == 4) {
				withdraw();
			}
			else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}

	//계좌 생성하기
	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.print("계좌번호 :");
		String account = scanner.next();
		System.out.print("계좌주 :");
		String name = scanner.next();
		System.out.print("초기입금액 :");
		int money = scanner.nextInt();
		System.out.println("결과 : 계좌가 생성되었습니다.");
		
		Account2 acc = new Account2(account, name, money);
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = acc;
				break;
			}
		}

	}
	//계좌 목록보기
	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		for(int i=0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
			System.out.println(accountArray[i].getAno() + " " + accountArray[i].getOwner() + " " + accountArray[i].getBalance());
			}
			else {
				break;
			}
		}
	}
	//예금하기
	private static void deposit() {
		Account2 account = null;
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		System.out.print("계좌번호 :");
		String accountch = scanner.next();
		System.out.print("예금액 :");
		int addmoney = scanner.nextInt();
		System.out.println("결과 : 예금이 성공되었습니다.");
		account = findAccount(accountch);
		if(account == null) {
			System.out.println("계좌번호가 맞지않음.");
		}
		else {
			account.setBalance(account.getBalance() + addmoney);
			}
	}

	//출금하기
	private static void withdraw() {
		Account2 account = null;
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		System.out.print("계좌번호 :");
		String accountch = scanner.next();
		System.out.print("출금액 :");
		int minmoney = scanner.nextInt();
		System.out.println("결과 : 출금이 성공되었습니다.");
		account = findAccount(accountch);
		account.setBalance(account.getBalance() - minmoney);
	}
	//Account배열에서 ano와 동일한 Account 객체 찾기
	private static Account2 findAccount(String ano) {
		Account2 account = null;
		for(int i=0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
				String acc = accountArray[i].getAno();
				if(acc.equals(ano)) {
					account = accountArray[i] ;
				}
			}
		}
		return account;
	}
}
