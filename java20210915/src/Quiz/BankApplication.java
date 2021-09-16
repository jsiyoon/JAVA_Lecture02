package Quiz;

import java.util.*;

public class BankApplication {
//	private static Account2[] accountArray = new Account2[100];
	private static ArrayList<Account2> accountArray = new ArrayList<>();
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
		
		Account2 acc = new Account2(account, name, money);
		accountArray.add(acc);
		System.out.println("��� : ���°� �����Ǿ����ϴ�.");
	}
	//���� ��Ϻ���
	private static void accountList() {
		System.out.println("------");
		System.out.println("���¸��");
		System.out.println("------");
		for(int i=0; i < accountArray.size(); i++) {
			System.out.println(accountArray.get(i));
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
		for(int i=0; i < accountArray.size(); i++) {
			if(accountArray.get(i).getAno().equals(ano)) {
				return accountArray.get(i);
				}
			}
		return account;
	}
}
