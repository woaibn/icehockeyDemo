package com.icehockey.service;

import java.util.List;

import com.icehockey.dao.ClubDao;
import com.icehockey.dao.DuiKangDao;
import com.icehockey.entity.Club;
import com.icehockey.entity.DuiKang;

public class DuiKangService {

	DuiKangDao dao = new DuiKangDao();
	List<DuiKang> duiKangs = null;
	DuiKang duiKang = null;

	public List<DuiKang> getDuiKangs() {// 返回数据库中的所有赛事对抗信息
		duiKangs = dao.getDuiKangs();
		if (duiKangs != null) {
			System.out.println("duiKangs:" + duiKangs);
		} else {
			System.out.println("无对抗记录");
		}
		return duiKangs;
	}

	public boolean addSaiShi(String address, String clubAName,
			String clubBName, String beizhu) {// 添加对抗赛事
		ClubDao clubDao = new ClubDao();
		boolean f = false;
		Club clubA = clubDao.getClubByClubName(clubAName);
		Club clubB = clubDao.getClubByClubName(clubBName);
		// 通过主场客场信息不同，加入顺序表也不同，默认如果已经存在该俱乐部信息，则从数据库中获取，否则，将俱乐部添加到俱乐部表中
		if (clubA != null) {
			if (clubB != null) {
				System.out.println("A俱乐部存在，B俱乐部也存在");
				f = dao.addSaiShiToDuikang(address, clubA.getClubId(),
						clubB.getClubId(), beizhu);

			} else {
				System.out.println("A俱乐部存在，B俱乐部不存在");
				f = dao.addSaiShi2(address, clubA.getClubId(), clubBName,
						beizhu, 0);
			}
		} else {
			if (clubB != null) {
				System.out.println("A俱乐部不存在，B俱乐部存在");
				f = dao.addSaiShi2(address, clubB.getClubId(), clubAName,
						beizhu, 1);
			} else {
				System.out.println("A俱乐部不存在，B俱乐部不存在");
				f = dao.addSaiShi(address, clubAName, clubBName, beizhu);
			}
		}

		if (f) {
			System.out.println("duikang插入成功");
		} else {
			System.out.println("插入失败");
		}
		return f;
	}
}
