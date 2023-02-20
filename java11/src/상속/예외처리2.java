package 상속;

import java.io.FileWriter;
import java.io.IOException;

public class 예외처리2 {

	public static void main(String[] args) {
		try {
			// 무조건 try-catch가 있어야하는 상황.
			FileWriter file = new FileWriter("test.txt");
			file.write("안녕\n");
			file.write("바이바이\n");
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
