package 배열심화;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원테이블 {

	public static void main(String[] args) {
		int[] a = new int[3];
		int[] b = {1,2,3};
		JFrame f = new JFrame();
		f.setSize(500, 500);
		String[] header = { "A", "B", "C" };
		String[][] content = { { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" },
				{ "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" },
				{ "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" },
				{ "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" },
				{ "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" },
				{ "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" },
				{ "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" },
				{ "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" },
				{ "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" },
				{ "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" } };
		
		String[] bbb = {"4","5","6"};
		content[0][0]="4";
		content[0]=bbb;
		//content[0]= {"4","5","6"};

		Integer[][] test = new Integer[10][];
		Integer[][] content2 = { { 1, 2, 3 }, { 1, 2, 3 } };
		Random r = new Random();
		
//		for (int i = 0; i < test.length; i++) {
//			for (int j = 0; j < test.length; j++) {
//				test[i][j]= r.nextInt(10);
//			}
//		}
		JTable table = new JTable(content2, header);
		JScrollPane scroll = new JScrollPane(table);

		f.add(scroll);
		f.setVisible(true);
	}

}
