package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BbsDAO { // DAO는 테이블 당 하나씩 ==> CUD를 완성!!
	
	public void delete(int no) {
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공");

			// 3. SQL
			// 자바는 부품조립식이여서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!
			String sql = "delete from hr.BBS where no = ? ";
			// con부품을 이용해서 sql에 있는 것을 SQL부품으로
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");
			
			ps.executeUpdate(); // insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void update(int no, String title, String content, String writer) {
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공");

			// 3. SQL
			// 자바는 부품조립식이여서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!
			String sql = "update hr.BBS set title = ?, content = ?, writer = ? where no = ?";
			// con부품을 이용해서 sql에 있는 것을 SQL부품으로
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, writer);
			ps.setInt(4, no);
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");
			
			ps.executeUpdate(); // insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void insert(int no, String title, String content, String writer) {
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			// 3. SQL
			// 자바는 부품조립식이여서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!
			// String sql = "insert into hr.MEMBER values ('" + id + "', '" + pw + "', '" +
			// name + "', '" + tel + "')";
			String sql = "insert into hr.BBS values (?, ?, ?, ?)";
			// con부품을 이용해서 sql에 있는 것을 SQL부품으로
			// R빼고, 인덱스는 0부터 시작!
			// 유일하게 db는 인덱스가 1부터 시작!!
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, no);
			ps.setString(2, title);
			ps.setString(3, content);
			ps.setString(4, writer);
			//==> insert into hr.MEMBER values ('','','','');
			System.out.println(sql);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			ps.executeUpdate(); // insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
