package ex21jdbc.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/*
 인터페이스를 구현했기 때문에 implements 사용
 */
public class IConnectImpl implements IConnect{
	
	public Connection con;
	public PreparedStatement psmt;//동적 쿼리 실행을 위한 객체
	public ResultSet rs;
	//기본(디폴트)생성자
	public IConnectImpl() {
		System.out.println("IConnectImpl 기본생성자 호출");
	}
	//인자생성자1: 아이디, 패스워드를 인자로받음
	public IConnectImpl(String user, String pass) {
		System.out.println("IConnectImpl 인자생성자 호출");
		try {
			Class.forName(ORACLE_DRIVER);
			connect(user, pass);
		}catch(ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	//인자생성자2 : 드라이버명까지 인자로받음
	public IConnectImpl(String driver, String user, String pass) {
		System.out.println("IConnectImpl 인자생성자 호출");
		try {
			Class.forName(driver);
			connect(user, pass);
		}catch(ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	//오라클에 연결
	@Override
	public void connect(String user, String pass) {
		try {
		con = DriverManager.getConnection(ORACLE_URL, user, pass);
		}
		catch(SQLException e) {
			System.out.println("데이터베이스 연결 오류");
			e.printStackTrace();
		}
	}
	//오버라이딩의 목적으로 정의한 메서드. 쿼리실행은 각 클래스에서 기술함.
	@Override
	public void execute() {
		//하는일 없음.
	}
	//자원반납
	@Override
	public void close() {
		try {	
			if(con!=null) con.close();
			if(psmt != null) psmt.close();
			if(rs != null) rs.close();
			System.out.println("자원반납완료");
		}
		catch(SQLException e) {
			System.out.println("자원반납시 오류가 발생하였습니다.");
			e.printStackTrace();
		}
	}
	//사용자로부터 입력값을 받기 위한 메서드
	@Override
	public String scanValue(String title) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(title+ "을(를) 입력(exit->종료): ");
		String inputStr = scan.nextLine();
		/*
		 equalsIgnoreCase()
		 	: equlas()와 동일하게 문자열이 같은지를 비교하는 메소드로
		 	대소문자를 구분없이 비교할 수 있다.
		 */
		if("EXIT".equalsIgnoreCase(inputStr)){ //대소문자를 구분하지 않는 입력
			System.out.println("프로그램을 종료합니다.");
			close();
			
			System.exit(0);
		}
		return inputStr;
	}
}
