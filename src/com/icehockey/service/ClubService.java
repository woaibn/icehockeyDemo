package com.icehockey.service;

import com.icehockey.dao.ClubDao;
import com.icehockey.entity.Club;

public class ClubService {

	ClubDao clubDao = new ClubDao();

	Club club = null;

	public Club getClubByClubName(String clubName) {//通过俱乐部名称查找俱乐部对象
		
		club=clubDao.getClubByClubName(clubName);
		if(club!=null){
			System.out.println(club.toString());
			return club;
		}else{
			System.out.println(clubName+"不存在");
			return null;
		}
		
	}

}
