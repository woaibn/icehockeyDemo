package com.icehockey.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import com.icehockey.entity.User;
import com.icehockey.util.DBUtil;

public class ADao2 {

	DBUtil util = new DBUtil();
	private ResultSet rs = null;
	private Connection conn = null;
	private User user = null;
	private PreparedStatement preparedStatement = null;

	/**
	 * @param telephone
	 * @return User
	 * 
	 *         通过手机号码查找到user对象并返回
	 */
	public User getUserByTelephone(String telephone) {
		String sql = "SELECT * FROM USER WHERE telephone=?";
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(1, telephone);
			rs = preparedStatement.executeQuery();
			if (rs.next()) {
			
				Timestamp timestamp = rs.getTimestamp("birthday");// '出生日期',
				String birthday = null;
				if (timestamp != null) {
					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
					birthday = df.format(timestamp.getTime());
					}																	
				System.out.println(birthday);
				return user;
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return user;
	}

	
}
