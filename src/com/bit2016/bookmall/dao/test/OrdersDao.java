package com.bit2016.bookmall.dao.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bit2016.bookmall.vo.OrdersVo;

public class OrdersDao {

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

	public List<OrdersVo> getList() {
		List<OrdersVo> list = new ArrayList<OrdersVo>();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			stmt = conn.createStatement();

			String sql = "select o.no, m.name || ' ' || m.email, o.price, o.address from orders o, member m where o.no2=m.no order by no asc";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Long no = rs.getLong(1);
				String name_email = rs.getString(2);
				Long price = rs.getLong(3);
				String address = rs.getString(4);

				OrdersVo vo = new OrdersVo();
				vo.setNo(no);
				vo.setName_email(name_email);
				vo.setPrice(price);
				vo.setAddress(address);

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

	public boolean insert(OrdersVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			// 1. connection 가져오기
			conn = getConnection();
			// 2. statement 준비
			String sql = "insert into orders values (orders_seq.nextval, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			// 3. 바인딩
			pstmt.setString(1, vo.getName_email());
			pstmt.setLong(2, vo.getPrice());
			pstmt.setString(3, vo.getAddress());

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
		return result == 1;
	}
}
