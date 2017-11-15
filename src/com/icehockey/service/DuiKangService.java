package com.icehockey.service;

import java.util.List;

import com.icehockey.dao.DuiKangDao;
import com.icehockey.entity.DuiKang;

public class DuiKangService {
	DuiKangDao dao=new DuiKangDao();
	
	public List<DuiKang> getDuiKangs(int userId) {
		return dao.getDuiKangsByUserId(userId);
	}

}
