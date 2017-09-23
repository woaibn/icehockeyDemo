package com.icehockey.service;

import com.icehockey.dao.HandlingDao;
import com.icehockey.entity.Handling;

public class HandlingService {

	HandlingDao dao = new HandlingDao();
	Handling handling = null;

	public Handling queryHandling(String handlingName) {
		
		handling =dao.getHandlingByHandlingValue(handlingName);
		if(handling!=null){
			System.out.println(handling);
		}else{
			System.out.println("持杆方式未找到");
		}
		return handling;
	}
}
