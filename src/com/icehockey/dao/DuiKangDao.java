package com.icehockey.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

import com.icehockey.entity.DuiKang;
import com.icehockey.util.DBUtil;

public class DuiKangDao {

	DuiKang duiKang = null;
	List<DuiKang> duiKangs=null;
	DBUtil util = new DBUtil();
	private ResultSet rs = null;
	private Statement statement = null;
	private Connection conn = null;
	private PreparedStatement preparedStatement = null;

	public List<DuiKang> getDuiKangs() {
		String sql = "SELECT * FROM duikangview";
		System.out.println(sql);
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			System.out.println(sql);
			rs = preparedStatement.executeQuery();
			while (rs.next()) {
				System.out.println(sql);
				 int duikangId=rs.getInt("duikangId"); 
				 int clubAId=rs.getInt("clubAId");
				 int clubBId=rs.getInt("clubBId");
				 String clubAName=rs.getString("clubAName");
				 String logoA=rs.getString("logoA");
				 String clubBName=rs.getString("clubBName");
				 String logoB=rs.getString("logoB");
				 Date onDate=rs.getDate("onDate");
				 String degree=rs.getString("degree");
				 String address=rs.getString("address");
				 int star=rs.getInt("star");
				 int round=rs.getInt("round");

				duiKang = new DuiKang(duikangId, clubAId, clubBId, clubAName, logoA, clubBName, logoB, onDate, degree, address, star, round);
				
				System.out.println(duiKang);
				duiKangs.add(duiKang);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return duiKangs;
	}
}
