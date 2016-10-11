package com.bit2016.bookmall.dao.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bit2016.bookmall.vo.MemberVo;

public class MemberDao {

	private Connection getConnection() throws SQLException {
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "bitdb", "bitdb");

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패:" + e);
		}

		return conn;
	}


	public List<MemberVo> getList() {
		List<MemberVo> list = new ArrayList<MemberVo>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			stmt = conn.createStatement();

			String sql = "select no, name, tel, email, password from member order by no asc";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String name = rs.getString(2);
				String tel = rs.getString(3);
				String email = rs.getString(4);
				String password = rs.getString(5);
				

				MemberVo vo = new MemberVo();
				vo.setName(name);
				vo.setTel(tel);
				vo.setEmail(email);
				vo.setPassword(password);
				
				list.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
		}
		return list;
	}

	public boolean insert(MemberVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			// 1. connection 가져오기
			conn = getConnection();
			// 2. statement 준비
			String sql = "insert into member values (member_seq.nextval, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			// 3. 바인딩
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getTel());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, vo.getPassword());
			// 4. 실행
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				// 3. 자원정리
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return result ==1;
	}
}
