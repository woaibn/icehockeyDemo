package com.icehockey.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.icehockey.entity.Role;
import com.icehockey.util.DBUtil;

public class RoleDao {
	Role role = null;
	DBUtil util = new DBUtil();
	private ResultSet rs = null;
	private Statement statement = null;
	private Connection conn = null;
	private PreparedStatement preparedStatement = null;

	public Role getRoleByRoleId(String roleName) {//通过roleValue获取角色对象
		String sql = "SELECT * FROM role where roleValue=?;";
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, roleName);
			rs = preparedStatement.executeQuery();
			if (rs.next()) {
				String roleValue = rs.getString("roleValue");
				int roleId = rs.getInt("roleId");
				roleName = rs.getString("roleName");
				role = new Role(roleId, roleName, roleValue);
			}else{
				System.out.println("该角色不存在");
				role=null;
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
		return role;
	}
}
