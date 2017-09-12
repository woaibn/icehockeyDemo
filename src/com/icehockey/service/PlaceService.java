package com.icehockey.service;

import com.icehockey.dao.PlaceDao;
import com.icehockey.entity.Place;

public class PlaceService {
	PlaceDao placeDao = new PlaceDao();

	Place place = null;

	public Place getPlaceByPlaceName(String placeName) {
		
		place=placeDao.getPlaceByPlaceName(placeName);
		if(place!=null){
			System.out.println(place.toString());
			return place;
		}else{
			System.out.println(placeName+"不存在");
			return null;
		}
		
	}

}
