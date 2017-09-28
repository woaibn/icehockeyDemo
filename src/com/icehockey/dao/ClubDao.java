package com.icehockey.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.icehockey.entity.Club;
import com.icehockey.util.DBUtil;

public class ClubDao {

	Club club = null;
	DBUtil util = new DBUtil();
	private ResultSet rs = null;
	private Statement statement = null;
	private Connection conn = null;
	private PreparedStatement preparedStatement = null;

	public Club getClubByClubName(String clubName) {//通过俱乐部名称查找俱乐部对象并返回
		String sql = "SELECT * FROM club where clubName=?;";
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);//预编译
			preparedStatement.setString(1, clubName);//放参数
			rs = preparedStatement.executeQuery();//执行sql
			if (rs.next()) {
				int clubId = rs.getInt("clubId");
				String organization = rs.getString("organization");
				String clubManager = rs.getString("clubManager");
				String address = rs.getString("address");
				String managementContent = rs.getString("managementContent");
				String telephone = rs.getString("telephone");
				Date buildTime = rs.getDate("buildTime");
				String resource = rs.getString("resource");
				String construct = rs.getString("construct");

				club = new Club(clubId, clubName, organization, clubManager, address, managementContent, telephone,
						buildTime, resource, construct);
			} else {
				System.out.println("俱乐部未找到");
				club = null;
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
		return club;
	}

}
