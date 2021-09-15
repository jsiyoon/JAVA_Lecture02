package Quiz;

import java.io.IOException;
import java.io.InputStreamReader;

public class Example6 {
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		
		isr.close();
		
			try {
				isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
}
