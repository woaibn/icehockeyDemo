package com.icehockey.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.icehockey.entity.Player;
import com.icehockey.entity.User;
import com.icehockey.util.DBUtil;

public class PlayerDao {

	DBUtil util = new DBUtil();
	private ResultSet rs = null;
	private Connection conn = null;
	private Player player = null;
	private List<Player> players = null;
	private PreparedStatement preparedStatement = null;

	/**
	 * @param userId
	 * @return List<Player>
	 * 
	 *         通过用户编号找到用户关注的球员列表
	 */
	public List<Player> getPlayersUserFollowed(int userId) {
		String sql = "SELECT player.playerId, player.`name`, player.sex, player.birthday, player.height, player.weight, player.countryId, player.cityId, player.firstLearnAge, player.roleId, player.handlingId, player.idType, player.idInfoId, player.categoryId, player.position, player.creatMeld, player.image, player.modificateDate, player.remark FROM player, userfollowplayer, `user` WHERE player.playerId = userfollowplayer.playerId AND `user`.userId = userfollowplayer.userId AND `user`.userId = ?";
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, userId);
			rs = preparedStatement.executeQuery();
			while (rs.next()) {

				int playerId = rs.getInt(""); // 运动员编号
				String name = rs.getString(""); // 姓名
				boolean sex = rs.getBoolean(""); // 性别
				Timestamp timestamp = rs.getTimestamp("birthday");// '出生日期',
				Date birthday = null;
				if (timestamp != null) {
					birthday = new Date(timestamp.getTime());
				}

				double height = rs.getDouble(""); // 身高
				double weight = rs.getDouble(""); // 体重
				int countryId = rs.getInt(""); // 国籍编号
				int cityId = rs.getInt(""); // 籍贯编号
				double firstLearnAge = rs.getDouble(""); // 初学年龄
				int roleId = rs.getInt(""); // 角色编号
				int handlingId = rs.getInt(""); // 持杆方式编号
				String idType = rs.getString(""); // 证件类型
				int idInfoId = rs.getInt(""); // 证件信息编号
				int categoryId = rs.getInt(""); // 类别编号
				String position = rs.getString(""); // 位置
				int creatMeld = rs.getInt(""); // 谁创建我
				String image = rs.getString(""); // 头像
				timestamp = rs.getTimestamp("modificateDate");// 修改时间
				Date modificateDate = null;
				if (timestamp != null) {
					modificateDate = new Date(timestamp.getTime());
				}
				String remark = rs.getString(""); // 备注

				player = new Player(playerId, name, sex, birthday, height, weight, countryId, cityId, firstLearnAge,
						roleId, handlingId, idType, idInfoId, categoryId, position, creatMeld, image, modificateDate,
						remark);
				players.add(player);
			}
			return players;
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
		return players;
	}

	/**
	 * @param userId 用户编号
	 * @param playerNameString 球员名字字符串
	 * @return List<Player>
	 * 
	 *         通过用户编号和球员名字字符串，模糊查询找到用户关注的球员列表
	 */
	public List<Player> getPlayersUserFollowedByNameString(int userId, String playerNameString) {
		String sql="SELECT player.playerId, player.`name`, player.sex, player.birthday, player.height, player.weight, player.countryId, player.cityId, player.firstLearnAge, player.roleId, player.handlingId, player.idType, player.idInfoId, player.categoryId, player.position, player.creatMeld, player.image, player.modificateDate, player.remark FROM player, userfollowplayer, `user` WHERE player.playerId = userfollowplayer.playerId AND `user`.userId = userfollowplayer.userId AND `user`.userId = ? AND player.`name` = '%?%';";
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, userId);
			preparedStatement.setString(1, playerNameString);
			rs = preparedStatement.executeQuery();
			while (rs.next()) {

				int playerId = rs.getInt(""); // 运动员编号
				String name = rs.getString(""); // 姓名
				boolean sex = rs.getBoolean(""); // 性别
				Timestamp timestamp = rs.getTimestamp("birthday");// '出生日期',
				Date birthday = null;
				if (timestamp != null) {
					birthday = new Date(timestamp.getTime());
				}

				double height = rs.getDouble(""); // 身高
				double weight = rs.getDouble(""); // 体重
				int countryId = rs.getInt(""); // 国籍编号
				int cityId = rs.getInt(""); // 籍贯编号
				double firstLearnAge = rs.getDouble(""); // 初学年龄
				int roleId = rs.getInt(""); // 角色编号
				int handlingId = rs.getInt(""); // 持杆方式编号
				String idType = rs.getString(""); // 证件类型
				int idInfoId = rs.getInt(""); // 证件信息编号
				int categoryId = rs.getInt(""); // 类别编号
				String position = rs.getString(""); // 位置
				int creatMeld = rs.getInt(""); // 谁创建我
				String image = rs.getString(""); // 头像
				timestamp = rs.getTimestamp("modificateDate");// 修改时间
				Date modificateDate = null;
				if (timestamp != null) {
					modificateDate = new Date(timestamp.getTime());
				}
				String remark = rs.getString(""); // 备注

				player = new Player(playerId, name, sex, birthday, height, weight, countryId, cityId, firstLearnAge,
						roleId, handlingId, idType, idInfoId, categoryId, position, creatMeld, image, modificateDate,
						remark);
				players.add(player);
			}
			return players;
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
		return players;
	}
	
	
	/**
	 * @param userId 用户编号
	 * @param playerName 球员名字
	 * @return List<Player>
	 * 
	 *         通过用户编号和球员名字字符串，精确查询找到用户关注的球员列表
	 */
	public List<Player> getPlayersUserFollowedByPlayerName(int userId, String playerName) {
		String sql="SELECT player.playerId, player.`name`, player.sex, player.birthday, player.height, player.weight, player.countryId, player.cityId, player.firstLearnAge, player.roleId, player.handlingId, player.idType, player.idInfoId, player.categoryId, player.position, player.creatMeld, player.image, player.modificateDate, player.remark FROM player, userfollowplayer, `user` WHERE player.playerId = userfollowplayer.playerId AND `user`.userId = userfollowplayer.userId AND `user`.userId = ? AND player.`name` = ?;";
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, userId);
			preparedStatement.setString(1, playerName);
			rs = preparedStatement.executeQuery();
			while (rs.next()) {

				int playerId = rs.getInt(""); // 运动员编号
				String name = rs.getString(""); // 姓名
				boolean sex = rs.getBoolean(""); // 性别
				Timestamp timestamp = rs.getTimestamp("birthday");// '出生日期',
				Date birthday = null;
				if (timestamp != null) {
					birthday = new Date(timestamp.getTime());
				}

				double height = rs.getDouble(""); // 身高
				double weight = rs.getDouble(""); // 体重
				int countryId = rs.getInt(""); // 国籍编号
				int cityId = rs.getInt(""); // 籍贯编号
				double firstLearnAge = rs.getDouble(""); // 初学年龄
				int roleId = rs.getInt(""); // 角色编号
				int handlingId = rs.getInt(""); // 持杆方式编号
				String idType = rs.getString(""); // 证件类型
				int idInfoId = rs.getInt(""); // 证件信息编号
				int categoryId = rs.getInt(""); // 类别编号
				String position = rs.getString(""); // 位置
				int creatMeld = rs.getInt(""); // 谁创建我
				String image = rs.getString(""); // 头像
				timestamp = rs.getTimestamp("modificateDate");// 修改时间
				Date modificateDate = null;
				if (timestamp != null) {
					modificateDate = new Date(timestamp.getTime());
				}
				String remark = rs.getString(""); // 备注

				player = new Player(playerId, name, sex, birthday, height, weight, countryId, cityId, firstLearnAge,
						roleId, handlingId, idType, idInfoId, categoryId, position, creatMeld, image, modificateDate,
						remark);
				players.add(player);
			}
			return players;
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
		return players;
	}
	
	/**
	 * @param telephone
	 * @return User
	 * 
	 *         通过手机号码,密码新建user对象并返回
	 */
	public User addUser(String telephone, String password) {
		String sql = "INSERT INTO user (telephone,password) VALUES (?,?)";
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, telephone);
			preparedStatement.setString(2, password);
			int i = preparedStatement.executeUpdate();
			if (i == 1) {
				System.out.println("插入成功");
				// user = getUserByTelephone(telephone);
				// return user;
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
	 * 通过userId等参数新建一个player 插入新用户，首先判断前端传入的角色名称，持杆方式名称是否存在，如果都存在，则插入，返回是否插入成功
	 */
	public Player addPlayer(int userId, String gender, double height, double weight, int categoryId, int handlingId,
			String userName, String imageUrl, Date currentDateTime) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
