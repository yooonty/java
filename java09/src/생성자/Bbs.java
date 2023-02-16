package 생성자;

public class Bbs {
	static int count;
	int no;
	String title;
	String content;
	String writer;

	public Bbs(String title, String content, String writer) {
		this.no = ++count;
		this.title = title;
		this.content = content;
		this.writer = writer;

	}

	@Override
	public String toString() {
		return "Bbs [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}

}
