package com.icehockey.service;

import java.util.List;

import com.icehockey.dao.UserDao;
import com.icehockey.entity.Handling;
import com.icehockey.entity.Role;
import com.icehockey.entity.User;

public class UserService {

	UserDao dao = new UserDao();
	List<User> users = null;//声明一个User集合
	User user = null;//声明一个User对象

	RoleService roleService=new RoleService();
	HandlingService handlingService=new HandlingService();
	
	
	public User loginByTelepone(String telephone, String password) {//通过手机号和密码登录
		user = dao.getUsersByTelephone(telephone);//先通过手机号查找到用户封装成User返回
		if (user != null) {//判断如果找到该手机号的用户
			if (password.equals(user.getPassword())) {//如果密码正确
				System.out.println("登陆成功");
				return user;
			} else {//密码错误，则给此用户Id赋值为-1
				System.out.println("密码错误");
				user = new User();
				user.setUserId(-1);
			}
		} else {//用户不存在，即登陆失败
			System.out.println("该用户不存在");
			user = null;
		}
		return user;
	}

	public User queryUserByUserId(int userId) {//通过用户Id查到当前用户，并返回User对象
		user = dao.getUserByUserId(userId);
		return user;
	}

	public List<User> queryUserByUserName(String userName) {//通过用户Name查找用户，可能不止一个，所以返回集合
		users = dao.queryUserByUserName(userName);
		if (users != null) {//如果找到了，打印集合
			System.out.println("users:"+users);
		} else {//否则输出不存在此名称用户
			System.out.println("不存在此名字的用户");
		}
		return users;
	}
	

	public List<User> queryTop10() {//查找到当前数据库的10个用户
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
		//插入新用户，首先判断前端传入的角色名称，持杆方式名称是否存在，如果都存在，则插入，返回是否插入成功
		Role role=roleService.queryRole(roleName);//查询当前角色名称是否在数据库中有对应的项
		if(role==null){
			System.out.println(roleName+"角色未找到");
			return false;
		}
		Handling handling =handlingService.queryHandling(handlingName);//根据持杆方式名称查询持杆方式对象
		if(handling==null){
			System.out.println(handlingName+"持杆方式未找到");
			return false;
		}		
		boolean f=dao.insertNewUser(gender, height,
				weight, role.getRoleId(), handling.getHandlingId(), userName, imageUrl);//执行插入动作，并返回是否插入成功
		if(f){
			System.out.println("创建成功");
		}else{
			System.out.println("新建球员失败");
		}
		return f;
	}

}
