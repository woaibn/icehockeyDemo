package com.icehockey.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.icehockey.entity.DuiKang;
import com.icehockey.util.DBUtil;

public class DuiKangDao {

	DuiKang duiKang = null;
	List<DuiKang> duiKangs = null;
	DBUtil util = new DBUtil();
	private ResultSet rs = null;
	private Statement statement = null;
	private Connection conn = null;
	private PreparedStatement preparedStatement = null;

	public List<DuiKang> getDuiKangs() {
		String sql = "SELECT * FROM duikangview";
		System.out.println(sql);
		duiKangs = new ArrayList<DuiKang>();
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			System.out.println(sql);
			rs = preparedStatement.executeQuery();
			while (rs.next()) {
				System.out.println(sql);
				int duikangId = rs.getInt("duikangId");
				int clubAId = rs.getInt("clubAId");
				int clubBId = rs.getInt("clubBId");
				String clubAName = rs.getString("clubAName");
				String logoA = rs.getString("logoA");
				String clubBName = rs.getString("clubBName");
				String logoB = rs.getString("logoB");
				Date onDate = rs.getDate("onDate");
				String degree = rs.getString("degree");
				String address = rs.getString("address");
				int star = rs.getInt("star");
				int round = rs.getInt("round");

				duiKang = new DuiKang(duikangId, clubAId, clubBId, clubAName,
						logoA, clubBName, logoB, onDate, degree, address, star,
						round);

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

	public boolean addSaiShi(String address, String clubAName,
			String clubBName, String beizhu) {
		try {
			// 获取数据库链接
			conn = util.openConnection();
			// 开启事务
			// 不把其设置为true之前都是一个当作一个事务来处理
			conn.setAutoCommit(false);
			// 创造SQL语句
			String sql1 = "INSERT INTO club (clubName) VALUES ('" + clubAName
					+ "')";
			String sql2 = "INSERT INTO club (clubName) VALUES ('" + clubBName
					+ "')";
			String sql3 = "INSERT INTO duikang ( clubAId, clubBId, address, beizhu ) VALUES (( SELECT clubId FROM club WHERE clubName = '"
					+ clubAName
					+ "' ), ( SELECT clubId FROM club WHERE clubName = '"
					+ clubBName + "' ), '" + address + "', '" + beizhu + "' )";
			System.out.println("sql1:  " + sql1);
			System.out.println("sql2:  " + sql2);
			System.out.println("sql3:  " + sql3);
			// 执行SQL语句
			statement = conn.createStatement();
			statement.executeUpdate(sql1);
			statement.executeUpdate(sql2);
			statement.executeUpdate(sql3);
			// 提交事务
			conn.commit();
			return true;
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
		return false;
	}

	public boolean addSaiShiToDuikang(String address, int clubAId, int clubBId,
			String beizhu) {
		String sql = "INSERT INTO duikang ( clubAId, clubBId, address, beizhu ) VALUES (?,?,?,?)";
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, clubAId);
			preparedStatement.setInt(2, clubBId);
			preparedStatement.setString(3, address);
			preparedStatement.setString(4, beizhu);
			System.out.println(sql);
			int i = preparedStatement.executeUpdate();
			if (i == 1) {
				System.out.println("插入成功");
				return true;
			} else
				System.out.println("插入失败");
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

	public boolean addSaiShi2(String address, int clubId, String clubName,
			String beizhu,int f) {
		try {
			// 获取数据库链接
			conn = util.openConnection();
			// 开启事务
			// 不把其设置为true之前都是一个当作一个事务来处理
			conn.setAutoCommit(false);
			// 创造SQL语句
			
			String sql2 = "INSERT INTO club (clubName) VALUES ('" + clubName+ "')";
			String sql3=null;
			if(f==0){
				 sql3 = "INSERT INTO duikang ( clubAId, clubBId, address, beizhu ) VALUES ("+clubId+", ( SELECT clubId FROM club WHERE clubName = '"+ clubName + "' ), '" + address + "', '" + beizhu + "' )";
				
			}else if(f==1){
				 sql3 = "INSERT INTO duikang ( clubBId, clubAId, address, beizhu ) VALUES ("+clubId+", ( SELECT clubId FROM club WHERE clubName = '"+ clubName + "' ), '" + address + "', '" + beizhu + "' )";
				
			}
			System.out.println("sql2:  " + sql2);
			System.out.println("sql3:  " + sql3);
			// 执行SQL语句
			statement = conn.createStatement();
			statement.executeUpdate(sql2);
			statement.executeUpdate(sql3);
			// 提交事务
			conn.commit();
			return true;
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
		return false;
	}

}
