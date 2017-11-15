package com.icehockey.service;

import java.util.List;

import com.icehockey.dao.UserFollowPlayerDao;
import com.icehockey.entity.UserFollowPlayer;

public class UserFollowPlayerService {

	UserFollowPlayerDao dao = new UserFollowPlayerDao();
	List<UserFollowPlayer> users = null;// 声明一个User集合
	UserFollowPlayer userFollowPlayer = null;// 声明一个User对象

	public UserFollowPlayer query(int userId, int playerId) {
		userFollowPlayer = dao.queryByUserIdPlayerId(userId, playerId);
		return userFollowPlayer;
	}

	public boolean updateRecord(int id, String dateString) {
		boolean b = dao.updateRe(id, dateString);
		return b;
	}

}
