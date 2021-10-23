package ex21jdbc.statement;

import java.sql.SQLException;

public class UpdateQuery extends ConnectDB{
	public UpdateQuery(String user, String pass) {
		//인자를 가진 부모의 생성자를 호출
		super(user,pass);
	}
	@Override
	public void execute() {
		try {
		stmt= con.createStatement();
		//statement객체 생성 및 쿼리작성, 실행	
		String sql = "UPDATE member "
				+" SET "
					+" pass='1234', "
					+" name ='일길동' "
					+ " regidate=sysdate "
					+" WHERE id = 'ko1' ";
		System.out.println("sql= "+sql);
		/*
		 쿼리 실행시 사용하는 메서드 종류
		 executeUpdate()
		 	:쿼리문이 insert/update/delete와 같이 기존 레코드에
		 	영향을 미치는 경우 사용한다. 실행 후 영향을 받은 행의 갯수를
		 	int로 반환한다.
		 executedQuery()
		 	: select 쿼리를 실행할 때 호출하는 메서드로 레코드에
		 	영향을 미치지 않고 조회만 하는 경우 사용한다.
		 	조회만 하는 경우 조회한다.
		 */
		
	
		int affected = stmt.executeUpdate(sql);
		System.out.println(affected+ "행이 업데이트됨.");
	}
	catch(SQLException e) {
		System.out.println("쿼리실행 오류");
		e.printStackTrace();
	}
	finally {
		close();
	}
	}
	public static void main(String[] args) {
	
		new UpdateQuery("kosmo", "1234").execute();

	}

}
