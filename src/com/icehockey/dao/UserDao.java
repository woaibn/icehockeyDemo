package com.icehockey.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.icehockey.entity.User;
import com.icehockey.util.DBUtil;

public class UserDao {

	DBUtil util = new DBUtil();
	private ResultSet rs = null;
	private Statement statement = null;
	private Connection conn = null;
	private User user = null;
	private PreparedStatement preparedStatement = null;

	public List<User> getUsers() {
		List<User> users = new ArrayList<User>();

		String sql = "SELECT * FROM USER, role, handling WHERE USER .roleId = role.roleId AND USER .handlingId = handling.handlingId";
		try {
			conn = util.openConnection();
			rs = statement.executeQuery(sql);
			while (rs.next()) {

				int userId = rs.getInt("userId");// '登录编号',
				String weChatId = rs.getString("weChatId");// '微信账号',
				String telephone = rs.getString("telephone");// '手机号码',
				String userName = rs.getString("userName");// '用户姓名',
				String sex = "man";
				if (rs.getInt("sex") == 1) {
					sex = "man";// '1代表男生0表示女生,默认为1男生',
				} else {
					sex = "lady";
				}
				String password = rs.getString("password");// '密码',
				Date birthday = rs.getDate("birthday");// '出生日期',
				String country = rs.getString("country");// '国籍',
				String city = rs.getString("city");// '城市',
				double height = rs.getDouble("height");// '身高',
				double weight = rs.getDouble("weight");// '体重',
				String play = rs.getString("play");// '爱好：玩雪，玩冰，都玩',
				String ice_User = rs.getString("ice_play");// '游戏项目',
				String snow_play = rs.getString("snow_play");// '单板，双板，都玩',
				String role = rs.getString("roleName");// '角色编号',
				String handing = rs.getString("handingName");// '持杆方式',
				String image = rs.getString("image");// '头像',

				user = new User(userId, weChatId, telephone, userName, sex,
						password, birthday, country, city, height, weight,
						play, ice_User, snow_play, role, handing, image);

				users.add(user);
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
		return users;
	}

	public User getUsersByTelephone(String telephoneNumber) {
		// List<user> users=new ArrayList<user>();

		String sql = "SELECT * FROM USER, role, handling WHERE USER .roleId = role.roleId AND USER .handlingId = handling.handlingId AND USER .telephone = ?";
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, telephoneNumber);
			System.out.println(sql);
			rs = preparedStatement.executeQuery();
			if (rs.next()) {

				int userId = rs.getInt("userId");// '登录编号',
				String weChatId = rs.getString("weChatId");// '微信账号',
				String telephone = rs.getString("telephone");// '手机号码',
				String userName = rs.getString("userName");// '用户姓名',
				String sex = "man";
				if (rs.getInt("sex") == 1) {
					sex = "man";// '1代表男生0表示女生,默认为1男生',
				} else {
					sex = "lady";
				}
				String password = rs.getString("password");// '密码',
				Date birthday = rs.getDate("birthday");// '出生日期',
				String country = rs.getString("country");// '国籍',
				String city = rs.getString("city");// '城市',
				double height = rs.getDouble("height");// '身高',
				double weight = rs.getDouble("weight");// '体重',
				String play = rs.getString("play");// '爱好：玩雪，玩冰，都玩',
				String ice_User = rs.getString("ice_play");// '游戏项目',
				String snow_play = rs.getString("snow_play");// '单板，双板，都玩',
				String role = rs.getString("roleName");// '角色编号',
				String handling = rs.getString("handlingName");// '持杆方式',
				String image = rs.getString("image");// '头像',

				user = new User(userId, weChatId, telephone, userName, sex,
						password, birthday, country, city, height, weight,
						play, ice_User, snow_play, role, handling, image);

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

	public User getUserByUserId(int userId) {

		String sql = "SELECT * FROM USER, role, handling WHERE USER .roleId = role.roleId AND USER .handlingId = handling.handlingId and user.userId=?";
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, userId);
			System.out.println(sql);
			rs = preparedStatement.executeQuery();
			if (rs.next()) {

				// int userId = rs.getInt("userId");// '登录编号',
				String weChatId = rs.getString("weChatId");// '微信账号',
				String telephone = rs.getString("telephone");// '手机号码',
				String userName = rs.getString("userName");// '用户姓名',
				String sex = "man";
				if (rs.getInt("sex") == 1) {
					sex = "man";// '1代表男生0表示女生,默认为1男生',
				} else {
					sex = "lady";
				}
				String password = rs.getString("password");// '密码',
				Date birthday = rs.getDate("birthday");// '出生日期',
				String country = rs.getString("country");// '国籍',
				String city = rs.getString("city");// '城市',
				double height = rs.getDouble("height");// '身高',
				double weight = rs.getDouble("weight");// '体重',
				String play = rs.getString("play");// '爱好：玩雪，玩冰，都玩',
				String ice_User = rs.getString("ice_play");// '游戏项目',
				String snow_play = rs.getString("snow_play");// '单板，双板，都玩',
				String role = rs.getString("roleName");// '角色编号',
				String handling = rs.getString("handlingName");// '持杆方式',
				String image = rs.getString("image");// '头像',

				user = new User(userId, weChatId, telephone, userName, sex,
						password, birthday, country, city, height, weight,
						play, ice_User, snow_play, role, handling, image);

				return user;
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

	
	

	public User fn(int userId, int roleId) {
		try {
			// 获取数据库链接
			conn = util.openConnection();
			// 开启事务
			// 不把其设置为true之前都是一个当作一个事务来处理
			conn.setAutoCommit(false);
			// 创造SQL语句
			String sql1 = "UPDATE user SET user.roleId=" + roleId
					+ " WHERE user.userId=" + userId + ";";
			String sql2 = null;
			if (roleId == 101) {// 教练
				sql2 = "INSERT INTO coach (userId) VALUES (" + userId + ")";
			} else if (roleId == 102) {// 裁判
				sql2 = "INSERT INTO judge (userId) VALUES (" + userId + ")";
			} else {// (roleId==103)守门员或者球员
				sql2 = "INSERT INTO player (userId) VALUES (" + userId + ")";
			}
			System.out.println("sql1:  " + sql1);
			System.out.println("sql2:  " + sql2);
			// 执行SQL语句
			statement = conn.createStatement();
			statement.executeUpdate(sql1);
			statement.executeUpdate(sql2);
			// 提交事务
			conn.commit();
			user = getUserByUserId(userId);
			System.out.println("OK!" + user);
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("有错误！");
			try {
				// 回滚事务
				// 撤销上面对事务的所有操作哈！

				conn.rollback();
				System.out.println("事物回滚");
			} catch (Exception e2) {
				System.out.println("事物回滚失败");
			}
		} finally {
			// 关闭Statement
			try {
				System.out.println("statement关闭");
				statement.close();
			} catch (Exception e) {
				System.out.println("statement关闭失败");
			}
			// 关闭Connection
			try {
				System.out.println("conn关闭");
				conn.close();
			} catch (Exception e) {
				System.out.println("conn关闭失败");
			}
		}
		return null;
	}

	
	public List<User> queryUserByUserName(String userName) {
		List<User> users = new ArrayList<User>();

		String sql = "SELECT * FROM USER, role, handling WHERE USER .roleId = role.roleId AND USER .handlingId = handling.handlingId AND user.userName=?";
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, userName);
			rs = preparedStatement.executeQuery();
			while (rs.next()) {

				int userId = rs.getInt("userId");// '登录编号',
				String weChatId = rs.getString("weChatId");// '微信账号',
				String telephone = rs.getString("telephone");// '手机号码',
				userName = rs.getString("userName");// '用户姓名'
				String sex = "man";
				if (rs.getInt("sex") == 1) {
					sex = "man";// '1代表男生0表示女生,默认为1男生',
				} else {
					sex = "lady";
				}
				String password = rs.getString("password");// '密码',
				Date birthday = rs.getDate("birthday");// '出生日期',
				String country = rs.getString("country");// '国籍',
				String city = rs.getString("city");// '城市',
				double height = rs.getDouble("height");// '身高',
				double weight = rs.getDouble("weight");// '体重',
				String play = rs.getString("play");// '爱好：玩雪，玩冰，都玩',
				String ice_User = rs.getString("ice_play");// '游戏项目',
				String snow_play = rs.getString("snow_play");// '单板，双板，都玩',
				String role = rs.getString("roleName");// '角色编号',
				String handing = rs.getString("handlingName");// '持杆方式',
				String image = rs.getString("image");// '头像',

				user = new User(userId, weChatId, telephone, userName, sex,
						password, birthday, country, city, height, weight,
						play, ice_User, snow_play, role, handing, image);

				users.add(user);
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
		return users;
	}

	public List<User> queryTop10() {
		List<User> users = new ArrayList<User>();

		String sql = "SELECT * FROM user,role,handling WHERE user.roleId=role.roleId AND user.handlingId=handling.handlingId LIMIT 10 ";

		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);

			rs = preparedStatement.executeQuery();
			while (rs.next()) {

				int userId = rs.getInt("userId");// '登录编号',
				String weChatId = rs.getString("weChatId");// '微信账号',
				String telephone = rs.getString("telephone");// '手机号码',
				String userName = rs.getString("userName");// '用户姓名'
				String sex = "man";
				if (rs.getInt("sex") == 1) {
					sex = "man";// '1代表男生0表示女生,默认为1男生',
				} else {
					sex = "lady";
				}
				String password = rs.getString("password");// '密码',
				Date birthday = rs.getDate("birthday");// '出生日期',
				String country = rs.getString("country");// '国籍',
				String city = rs.getString("city");// '城市',
				double height = rs.getDouble("height");// '身高',
				double weight = rs.getDouble("weight");// '体重',
				String play = rs.getString("play");// '爱好：玩雪，玩冰，都玩',
				String ice_User = rs.getString("ice_play");// '游戏项目',
				String snow_play = rs.getString("snow_play");// '单板，双板，都玩',
				String role = rs.getString("roleName");// '角色编号',
				String handing = rs.getString("handlingName");// '持杆方式',
				String image = rs.getString("image");// '头像',

				user = new User(userId, weChatId, telephone, userName, sex,
						password, birthday, country, city, height, weight,
						play, ice_User, snow_play, role, handing, image);

				users.add(user);
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
		return users;
	}


	public boolean insertNewUser(String gender, double height, double weight,
			int roleId, int handlingId, String userName, String imageUrl) {
		int sex = 1;
		if ("man".equals(gender)) {
			sex = 1;
		} else if ("lady".equals(gender)) {
			sex = 0;
		} else {
			System.out.println("性别输入不合法");
		}
		String sql="INSERT INTO user(userName,sex,height,weight,roleId,handlingId,image) VALUES(?,?,?,?,?,?,?)";
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, userName);
			preparedStatement.setInt(2, sex);
			preparedStatement.setDouble(3, height);
			preparedStatement.setDouble(4, weight);
			preparedStatement.setInt(5, roleId);
			preparedStatement.setInt(6, handlingId);
			preparedStatement.setString(7, imageUrl);
			System.out.println("sql:" + sql);
			int i = preparedStatement.executeUpdate();
			if (i == 1) {
				return true;
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
		return false;
	}
}
