package com.icehockey.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.icehockey.util.DBUtil;

public class CompetitionDao {

	DBUtil util = new DBUtil();
	private ResultSet rs = null;
	private Connection conn = null;
	private PreparedStatement preparedStatement = null;

	/**
	 * @param rinkId
	 * @param teamBId
	 * @param teamAId
	 * @param telephone
	 * @param remark
	 * @param b
	 * @return Competition
	 * 
	 *         通过手机号码查找到Competition对象并返回
	 */
	public boolean insertRe(int teamAId, int teamBId, int rinkId, String competitionTime, String remark,
			boolean competitionType) {
		String sql = "INSERT INTO competition (teamAId,teamBId,rinkId,competitionTime,competitionType,remark) VALUES (?,?,?,?,?,?)";
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, teamAId);
			preparedStatement.setInt(2, teamBId);
			preparedStatement.setInt(3, rinkId);
			preparedStatement.setString(4, competitionTime);
			preparedStatement.setBoolean(5, competitionType);
			preparedStatement.setString(6, remark);
			int i = preparedStatement.executeUpdate();
			if (i == 1) {
				System.out.println("插入成功");
				return true;
			} else
				return false;
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

		return false;
	}

}
