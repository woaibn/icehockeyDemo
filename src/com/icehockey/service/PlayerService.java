package com.icehockey.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.icehockey.dao.PlayerDao;
import com.icehockey.dao.UserDao;
import com.icehockey.entity.IdInfo;
import com.icehockey.entity.Player;
import com.icehockey.entity.User;

public class PlayerService {

	UserDao dao = new UserDao();
	List<User> users = null;// 声明一个User集合
	

	PlayerDao playerDao = new PlayerDao();
	List<Player> players = null;// 声明一个Player集合
	Player player = null;// 声明一个Player对象

	/**
	 * @param userId
	 *            用户编号
	 * 
	 *            返回用户关注的球员
	 */
	public List<Player> getUserFollowedPlayers(int userId) {
		players = playerDao.getPlayersUserFollowed(userId);
		if (players != null) {
			System.out.println(players);
		} else {
			System.out.println("getUserFollowedPlayers.....PlayerService......null");
			players = null;
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
	public List<Player> getUserFollowedPlayersByNameString(int userId,String playerNameString) {
		players = playerDao.getPlayersUserFollowedByNameString(userId,playerNameString);
		if (players != null) {
			System.out.println(players);
		} else {
			System.out.println("getUserFollowedPlayersByNameString.....PlayerService......null");
			players = null;
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
	public List<Player> getUserFollowedPlayersByPlayerName(int userId, String playerName) {
		players = playerDao.getPlayersUserFollowedByPlayerName(userId,playerName);
		if (players != null) {
			System.out.println(players);
		} else {
			System.out.println("getUserFollowedPlayersByPlayerName.....PlayerService......null");
			players = null;
		}
		return players;
	}

	/**
	 * 通过userId等参数新建一个player 插入新用户，首先判断前端传入的角色名称，持杆方式名称是否存在，如果都存在，则插入，返回是否插入成功
	 */
	public boolean insertNewPlayer(int userId, String gender, double height, double weight, int categoryId,
			int handlingId, String userName, String imageUrl, IdInfo idInfo) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		Date currentDateTime=new Date();
        System.out.println(df.format(currentDateTime));// new Date()为获取当前系统时间
		player=playerDao.addPlayer(userId, gender, height, weight, categoryId,
				handlingId, userName, imageUrl,currentDateTime);
		return false;
	}

	
	

}
