package com.icehockey.service;

import java.util.List;

import com.icehockey.dao.UserDao;
import com.icehockey.entity.Handling;
import com.icehockey.entity.Role;
import com.icehockey.entity.User;

public class UserService {

	UserDao dao = new UserDao();
	List<User> users = null;
	User user = null;

	RoleService roleService=new RoleService();
	HandlingService handlingService=new HandlingService();
	
	public User queryByTelepone(String telephone) {
		user = dao.getUsersByTelephone(telephone);
		return user;
	}

	public User loginByTelepone(String telephone, String password) {
		user = dao.getUsersByTelephone(telephone);
		if (user != null) {
			if (password.equals(user.getPassword())) {
				System.out.println("登陆成功");
				return user;
			} else {
				System.out.println("密码错误");
				user = new User();
				user.setUserId(-1);
			}
		} else {
			System.out.println("该用户不存在");
			user = null;
		}
		return user;
	}

	public User queryUserByUserId(int userId) {
		user = dao.getUserByUserId(userId);
		return user;
	}

	public List<User> queryUserByUserName(String userName) {
		System.out.println("aaaaaa");
		users = dao.queryUserByUserName(userName);
		if (users != null) {
			System.out.println("users:"+users);
		} else {
			System.out.println("不存在此名字的用户");
		}
		return users;
	}
	

	public List<User> queryTop10() {
		users = dao.queryTop10();
		if (users != null) {
			System.out.println(users);
		} else {
			System.out.println("不存在此名字的用户");
		}
		return users;
	}

	public boolean insertNewUser(String gender, double height, double weight,
			String roleName, String handlingName, String userName, String imageUrl) {
		Role role=roleService.queryRole(roleName);
		if(role==null){
			System.out.println(roleName+"角色未找到");
			return false;
		}
		Handling handling =handlingService.queryHandling(handlingName);
		if(handling==null){
			System.out.println(handlingName+"持杆方式未找到");
			return false;
		}		
		boolean f=dao.insertNewUser(gender, height,
				weight, role.getRoleId(), handling.getHandlingId(), userName, imageUrl);
		if(f){
			System.out.println("创建成功");
		}else{
			System.out.println("新建球员失败");
		}
		return f;
	}

}
