package textbook.exercices;

import java.util.Scanner;

public class BankApplication {
	private static Account2[] accountArray = new Account2[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-----------------------------------------");
			System.out.print("����>");
			
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
		System.out.println("���α׷� ����.");
	}

	//���� �����ϱ�
	private static void createAccount() {
		System.out.println("------");
		System.out.println("���»���");
		System.out.println("------");
		System.out.print("���¹�ȣ :");
		String account = scanner.next();
		System.out.print("������ :");
		String name = scanner.next();
		System.out.print("�ʱ��Աݾ� :");
		int money = scanner.nextInt();
		System.out.println("��� : ���°� �����Ǿ����ϴ�.");
		
		Account2 acc = new Account2(account, name, money);
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = acc;
				break;
			}
		}

	}
	//���� ��Ϻ���
	private static void accountList() {
		System.out.println("------");
		System.out.println("���¸��");
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
	//�����ϱ�
	private static void deposit() {
		Account2 account = null;
		System.out.println("------");
		System.out.println("����");
		System.out.println("------");
		System.out.print("���¹�ȣ :");
		String accountch = scanner.next();
		System.out.print("���ݾ� :");
		int addmoney = scanner.nextInt();
		System.out.println("��� : ������ �����Ǿ����ϴ�.");
		account = findAccount(accountch);
		if(account == null) {
			System.out.println("���¹�ȣ�� ��������.");
		}
		else {
			account.setBalance(account.getBalance() + addmoney);
			}
	}

	//����ϱ�
	private static void withdraw() {
		Account2 account = null;
		System.out.println("------");
		System.out.println("���");
		System.out.println("------");
		System.out.print("���¹�ȣ :");
		String accountch = scanner.next();
		System.out.print("��ݾ� :");
		int minmoney = scanner.nextInt();
		System.out.println("��� : ����� �����Ǿ����ϴ�.");
		account = findAccount(accountch);
		account.setBalance(account.getBalance() - minmoney);
	}
	//Account�迭���� ano�� ������ Account ��ü ã��
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
