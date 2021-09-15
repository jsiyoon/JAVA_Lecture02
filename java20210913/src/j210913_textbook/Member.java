package j210913_textbook;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + ":" + name;
	}
}
