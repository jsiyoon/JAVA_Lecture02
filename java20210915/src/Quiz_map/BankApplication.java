package Quiz_map;

import java.util.*;

public class BankApplication {
	// Account��ü�� ���������� ���� �� ����.
		// ����Ÿ���� �������� ��� null �ʱ�ȭ��.
		private static Map<String, Account> accountMap = new HashMap<>();
		private static Scanner scanner = new Scanner(System.in);

		public static void main(String[] args) {
			boolean run = true;

			while (run) {
				System.out.println("-------------------------------------------");
				System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
				System.out.println("-------------------------------------------");
				System.out.print("����>");

				int selectNo = scanner.nextInt();

				if (selectNo == 1) {
					createAccount();
				} else if (selectNo == 2) {
					accountList();
				} else if (selectNo == 3) {
					deposit();
				} else if (selectNo == 4) {
					withdraw();
				} else if (selectNo == 5) {
					run = false;
				}
			}

			System.out.println("���α׷� ����");
		}

		private static void createAccount() {
			System.out.println("---------------");
			System.out.println("���»���");
			System.out.println("---------------");
			
			System.out.print("���¹�ȣ:");
			String ano = scanner.next();
			
			System.out.print("������:");
			String owner = scanner.next();
			
			System.out.print("�ʱ��Աݾ�:");
			int balance = scanner.nextInt();
			
			Account account = new Account(owner, balance);
			accountMap.put(ano, account);
			
			System.out.println("���: ���°� �����Ǿ����ϴ�.");
			
		}

		private static void accountList() {
			System.out.println("---------------");
			System.out.println("���¸��");
			System.out.println("---------------");
			
			Set<String> keys = accountMap.keySet();
			for (String key : keys) {
				System.out.print(key + "   ");
				System.out.print(accountMap.get(key).getOwner() + "   ");
				System.out.println(accountMap.get(key).getBalance());
				 
			}
		}

		private static void deposit() {
			System.out.println("---------------");
			System.out.println("����");
			System.out.println("---------------");
			
			System.out.print("���¹�ȣ:");
			String ano = scanner.next();
			
			System.out.print("���ݾ�:");
			int money = scanner.nextInt();
			
			Account account = findAccount(ano);
			
			if (account != null) {
				int balance = account.getBalance() + money;
				account.setBalance(balance);
				
				System.out.println("���: ������ �����Ǿ����ϴ�.");
			}
			
		}
		
		private static void withdraw() {
			System.out.println("---------------");
			System.out.println("���");
			System.out.println("---------------");
			
			System.out.print("���¹�ȣ:");
			String ano = scanner.next();
			
			System.out.print("��ݾ�:");
			int money = scanner.nextInt();
			
			Account account = findAccount(ano);
			
			if (account != null) {
				int balance = account.getBalance() - money;
				account.setBalance(balance);
				
				System.out.println("���: ����� �����Ǿ����ϴ�.");
			}
		}
		
		private static Account findAccount(String ano) {
			if (accountMap.containsKey(ano)) {
				return accountMap.get(ano);
			}			
			System.out.println("���¹�ȣ�� �������� �ʽ��ϴ�.");
			return null;
		}
}
