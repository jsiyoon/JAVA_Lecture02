package j210906_1;

public interface Pet {
	void sit();
	default void roll() {//�׻� public ����Ʈ �޼���
		System.out.println("�����ϴ�.");
	}
	
}
