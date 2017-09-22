package com.icehockey.service;

import com.icehockey.dao.HandlingDao;
import com.icehockey.entity.Handling;

public class HandlingService {

	HandlingDao dao = new HandlingDao();
	Handling handling = null;

	public Handling queryHandling(String handlingName) {
		return dao.getHandlingByHandlingValue(handlingName);
	}
}
