package j210908_Custom;

public class Example1 {
	public static void main(String[] args) {
		try {			
			String s = getImage("cat");
			
			System.out.println("ã�� �̹���" + s);
			System.out.println("���α׷� ����");
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
	}
	public static String getImage(String name) {
		String[] images = {"dog", "lion"};
		
		for(String image : images) {
			if(image.equals(name)) {
				return image;
			}
		}
		throw new ImageNotFoundException();
	}
}
