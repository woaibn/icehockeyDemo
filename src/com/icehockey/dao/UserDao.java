package com.icehockey.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.icehockey.entity.User;
import com.icehockey.util.DBUtil;

public class UserDao {

	DBUtil util = new DBUtil();
	private ResultSet rs = null;
	private Connection conn = null;
	private User user = null;
	private List<User> users = null;
	private PreparedStatement preparedStatement = null;

	/**
	 * @param telephone
	 * @return User
	 * 
	 *         通过手机号码查找到user对象并返回
	 */
	public User getUserByTelephone(String telephone) {
		String sql = "SELECT * FROM user WHERE user.telephone=?";
		System.out.println(sql);
		try {
			conn = util.openConnection();
			System.out.println(conn);
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, telephone);
			rs = preparedStatement.executeQuery();
			System.out.println(telephone);
			if (rs.next()) {
				int userId = rs.getInt("userId");// '用户编号',
				String userName = rs.getString("userName");// '用户姓名',
				String weChatId = rs.getString("weChatId");// '微信账号',
				String password = rs.getString("password");// '登录密码',
				String roleId = rs.getString("roleId");// '角色编号',
				boolean sex = rs.getBoolean("sex");// '性别',
				Timestamp timestamp = rs.getTimestamp("birthday");// '用户出生日期',
				Date birthday = null;
				if (timestamp != null) {
					birthday = new Date(timestamp.getTime());
				}
				String idType = rs.getString("idType");// '证件类型',
				int idInfoId = rs.getInt("idInfoId");// '证件类型编号',
				int countryId = rs.getInt("countryId");// '国籍编号',
				int cityId = rs.getInt("cityId");// '籍贯编号',
				String address = rs.getString("address");// '住址',
				timestamp = rs.getTimestamp("joinDate");
				Date joinDate = null;
				if (timestamp != null) {
					birthday = new Date(timestamp.getTime());
				}
				String remark = rs.getString("remark");// '备注',
				user = new User(userId, userName, weChatId, telephone, password, roleId, sex, birthday, idType,
						idInfoId, countryId, cityId, address, joinDate, remark);
				System.out.println(user+"......DAO");
				return user;
			} else {
				System.out.println("dao层未找到");
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

	/**
	 * @param telephone
	 * @return User
	 * 
	 *         通过手机号码,密码新建user对象并返回
	 */
	public User addUser(String telephone, String password) {
		String sql="INSERT INTO user (telephone,password) VALUES (?,?)";
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, telephone);
			preparedStatement.setString(2, password);
			int i = preparedStatement.executeUpdate();
			if (i == 1) {
				System.out.println("插入成功");
				user=getUserByTelephone(telephone);
				return user;
			} else
				return null;
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
		return null;
	}
	/**
	 * @param userId
	 * @return User
	 * 
	 *          通过userid查找用户并返回user对象
	 */
	public User getUserByUserId(int userId) {

		return user;
	}
	/**
	 * @param userName
	 * @return List<User>
	 * 
	 *          // 返回所有姓名为userName的用户，并返回user的集合
	 */
	public List<User> queryUserByUserName(String userName) {

		return users;
	}
	/**
	 * @param telephone
	 * @return List<User>
	 * 
	 *          // 返回数据库中前10位用户的信息
	 */
	public List<User> queryTop10() {

		return users;
	}
	/**
	 * @param telephone
	 * @return User
	 * 
	 *         // 插入新的用户，并返回是否出成功
	 */
	public boolean insertNewUser(String gender, double height, double weight, int roleId, int handlingId,
			String userName, String imageUrl) {
		return false;
	}

	
}
