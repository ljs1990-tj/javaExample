package day17;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day16.DBClass;

public class UserManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan = new Scanner(System.in);
			DBClass db = new DBClass();
			Statement stmt = db.stmt;
			
			// 아이디, 비밀번호, 이름을 입력받아서 TBL_USER에 저장
			String id = "";
			while(true) {
				System.out.print("아이디 : ");
				id = scan.next();
				String idCheck = 
						"SELECT * FROM TBL_USER "
						+ "WHERE USERID = '" + id +"'";
				ResultSet rs = stmt.executeQuery(idCheck);
				if(rs.next()) {
					System.out.println("이미 사용중인 아이디 입니다.");
				} else {
					break;
				}
			}
			
			
			System.out.print("비밀번호 : ");
			String pwd = scan.next();
			System.out.print("이름 : ");
			String name = scan.next();
			
			String sql = 
					"INSERT INTO TBL_USER"
					+ "(USERID, PASSWORD, USERNAME) "
					+ "VALUES("
					+ "'" + id + "',"
					+ "'" + pwd + "',"
					+ "'" + name + "')";
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("가입되었습니다!");
			}
			
//			System.out.println(sql);
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
