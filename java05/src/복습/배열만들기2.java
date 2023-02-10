package 복습;

public class 배열만들기2 {

	public static void main(String[] args) {
		String[] trip = { "미국", "호주", "캐나다", "일본", "프랑스" };
		char[] color = { 'b', 'g', 'y', 'o', 'b' };
		double[] height = { 180.1, 179.8, 177.3, 170.6, 186.5 };

		for (String s : trip) {
			System.out.println(s);
		}
		for (char c : color) {
			System.out.println(c);
		}
		for (double d : height) {
			System.out.println(d);
		}

	}
}
