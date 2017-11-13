package com.icehockey.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.icehockey.entity.Rink;
import com.icehockey.util.DBUtil;

public class RinkDao {
	Rink rink = null;
	List<Rink> rinks = null;
	DBUtil util = new DBUtil();
	private ResultSet rs = null;
	private Statement statement = null;
	private Connection conn = null;
	private PreparedStatement preparedStatement = null;

	/**
	 * 获取Rink表中的所有信息
	 */
	public List<Rink> getRinks() {
		String sql = "SELECT * FROM rink;";
		rinks = new ArrayList<Rink>();
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			while (rs.next()) {

				int rinkId = rs.getInt("rinkId"); // 场地编号
				String rinkName = rs.getString("rinkName"); // 场地名称
				String rinkLogo = rs.getString("rinkLogo"); // 场地LOGO
				int countryId = rs.getInt("countryId"); // 国籍编号
				int cityId = rs.getInt("cityId"); // 籍贯编号
				String telephone = rs.getString("telephone"); // 场地电话
				boolean indoor = rs.getBoolean("indoor"); // 室内or室外
				boolean hasLocker = rs.getBoolean("hasLocker"); // 有无更衣室
				boolean hasCarpark = rs.getBoolean("hasCarpark"); // 有无停车场
				String trainingDegree = rs.getString("trainingDegree"); // 冰场训练等级
				int scale = rs.getInt("scale"); // 规模
				boolean hasLandTrainingRoom = rs.getBoolean("hasLandTrainingRoom"); // 有无陆地训练室
				double area = rs.getInt("area"); // 占地面积
				double iceArea = rs.getInt("iceArea"); // 冰面面积

				Timestamp timestamp = rs.getTimestamp("completionDate");// 建成时间
				Date completionDate = null;
				if (timestamp != null) {
					completionDate = new Date(timestamp.getTime());
				}
				timestamp = rs.getTimestamp("beginUseDate");// 投入使用时间
				Date beginUseDate = null;
				if (timestamp != null) {
					beginUseDate = new Date(timestamp.getTime());
				}

				timestamp = rs.getTimestamp("openTime");// 开放时间
				Date openTime = null;
				if (timestamp != null) {
					openTime = new Date(timestamp.getTime());
				}
				boolean allowedSlip = rs.getBoolean("allowedSlip"); // 是否接受散滑
				String email = rs.getString("email"); // 电子邮件
				String iceType = rs.getString("iceType"); // 冰面类型
				String address = rs.getString("address"); // 地址
				int environmentalIndex = rs.getInt("environmentalIndex"); // 环境指数

				timestamp = rs.getTimestamp("changeDate");// 最后修改时间
				Date changeDate = null;
				if (timestamp != null) {
					changeDate = new Date(timestamp.getTime());
				}
				String remark = rs.getString("remark"); // 备注
				rink = new Rink(rinkId, rinkName, rinkLogo, countryId, cityId, telephone, indoor, hasLocker, hasCarpark,
						trainingDegree, scale, hasLandTrainingRoom, area, iceArea, completionDate, beginUseDate,
						openTime, allowedSlip, email, iceType, address, environmentalIndex, changeDate, remark);
				System.out.println(rink);
				rinks.add(rink);
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
		return rinks;
	}

	/**
	 * 获取Rink表中的通过冰场名称模糊查询
	 */
	public List<Rink> getRinksByString(String nameString) {
		String sql = "SELECT * FROM rink WHERE rinkName LIKE '%"+nameString+"%';";
		System.out.println(sql);
		rinks = new ArrayList<Rink>();
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			while (rs.next()) {

				int rinkId = rs.getInt("rinkId"); // 场地编号
				String rinkName = rs.getString("rinkName"); // 场地名称
				String rinkLogo = rs.getString("rinkLogo"); // 场地LOGO
				int countryId = rs.getInt("countryId"); // 国籍编号
				int cityId = rs.getInt("cityId"); // 籍贯编号
				String telephone = rs.getString("telephone"); // 场地电话
				boolean indoor = rs.getBoolean("indoor"); // 室内or室外
				boolean hasLocker = rs.getBoolean("hasLocker"); // 有无更衣室
				boolean hasCarpark = rs.getBoolean("hasCarpark"); // 有无停车场
				String trainingDegree = rs.getString("trainingDegree"); // 冰场训练等级
				int scale = rs.getInt("scale"); // 规模
				boolean hasLandTrainingRoom = rs.getBoolean("hasLandTrainingRoom"); // 有无陆地训练室
				double area = rs.getInt("area"); // 占地面积
				double iceArea = rs.getInt("iceArea"); // 冰面面积

				Timestamp timestamp = rs.getTimestamp("completionDate");// 建成时间
				Date completionDate = null;
				if (timestamp != null) {
					completionDate = new Date(timestamp.getTime());
				}
				timestamp = rs.getTimestamp("beginUseDate");// 投入使用时间
				Date beginUseDate = null;
				if (timestamp != null) {
					beginUseDate = new Date(timestamp.getTime());
				}

				timestamp = rs.getTimestamp("openTime");// 开放时间
				Date openTime = null;
				if (timestamp != null) {
					openTime = new Date(timestamp.getTime());
				}
				boolean allowedSlip = rs.getBoolean("allowedSlip"); // 是否接受散滑
				String email = rs.getString("email"); // 电子邮件
				String iceType = rs.getString("iceType"); // 冰面类型
				String address = rs.getString("address"); // 地址
				int environmentalIndex = rs.getInt("environmentalIndex"); // 环境指数

				timestamp = rs.getTimestamp("changeDate");// 最后修改时间
				Date changeDate = null;
				if (timestamp != null) {
					changeDate = new Date(timestamp.getTime());
				}
				String remark = rs.getString("remark"); // 备注
				rink = new Rink(rinkId, rinkName, rinkLogo, countryId, cityId, telephone, indoor, hasLocker, hasCarpark,
						trainingDegree, scale, hasLandTrainingRoom, area, iceArea, completionDate, beginUseDate,
						openTime, allowedSlip, email, iceType, address, environmentalIndex, changeDate, remark);
				System.out.println(rink);
				rinks.add(rink);
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
		return rinks;
	}
	/**
	 * @param rinkId
	 *            冰场编号 通过冰场名称获取冰场对象
	 * 
	 */
	public Rink getRinkByRinkName(int rinkId) {
		String sql = "SELECT * FROM rink where rinkId=?;";
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, rinkId);
			rs = preparedStatement.executeQuery();
			if (rs.next()) {
				String rinkName = rs.getString("rinkName"); // 场地名称
				String rinkLogo = rs.getString("rinkLogo"); // 场地LOGO
				int countryId = rs.getInt("countryId"); // 国籍编号
				int cityId = rs.getInt("cityId"); // 籍贯编号
				String telephone = rs.getString("telephone"); // 场地电话
				boolean indoor = rs.getBoolean("indoor"); // 室内or室外
				boolean hasLocker = rs.getBoolean("hasLocker"); // 有无更衣室
				boolean hasCarpark = rs.getBoolean("hasCarpark"); // 有无停车场
				String trainingDegree = rs.getString("trainingDegree"); // 冰场训练等级
				int scale = rs.getInt("scale"); // 规模
				boolean hasLandTrainingRoom = rs.getBoolean("hasLandTrainingRoom"); // 有无陆地训练室
				double area = rs.getInt("area"); // 占地面积
				double iceArea = rs.getInt("iceArea"); // 冰面面积

				Timestamp timestamp = rs.getTimestamp("completionDate");// 建成时间
				Date completionDate = null;
				if (timestamp != null) {
					completionDate = new Date(timestamp.getTime());
				}
				timestamp = rs.getTimestamp("beginUseDate");// 投入使用时间
				Date beginUseDate = null;
				if (timestamp != null) {
					beginUseDate = new Date(timestamp.getTime());
				}

				timestamp = rs.getTimestamp("openTime");// 开放时间
				Date openTime = null;
				if (timestamp != null) {
					openTime = new Date(timestamp.getTime());
				}
				boolean allowedSlip = rs.getBoolean("allowedSlip"); // 是否接受散滑
				String email = rs.getString("email"); // 电子邮件
				String iceType = rs.getString("iceType"); // 冰面类型
				String address = rs.getString("address"); // 地址
				int environmentalIndex = rs.getInt("environmentalIndex"); // 环境指数

				timestamp = rs.getTimestamp("changeDate");// 最后修改时间
				Date changeDate = null;
				if (timestamp != null) {
					changeDate = new Date(timestamp.getTime());
				}
				String remark = rs.getString("remark"); // 备注
				rink = new Rink(rinkId, rinkName, rinkLogo, countryId, cityId, telephone, indoor, hasLocker, hasCarpark,
						trainingDegree, scale, hasLandTrainingRoom, area, iceArea, completionDate, beginUseDate,
						openTime, allowedSlip, email, iceType, address, environmentalIndex, changeDate, remark);
				System.out.println(rink);
				return rink;
			} else {
				System.out.println("冰场未找到");
				return null;
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
		return null;
	}

}
