package com.icehockey.service;

import java.util.List;

import com.icehockey.dao.PlaceDao;
import com.icehockey.entity.Place;

public class PlaceService {
	PlaceDao placeDao = new PlaceDao();

	Place place = null;
	List<Place> places=null;

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

	public List<Place> getPlaces() {
		places=placeDao.getPlaces();
		if(places!=null){
			System.out.println(places.toString());
			return places;
		}else{
			System.out.println("place为空");
			return null;
		}
	}

	public List<Place> getPlacesByPlaceName(String placeName) {
		places=placeDao.getPlaces2(placeName);
		if(places!=null){
			System.out.println(places.toString());
			return places;
		}else{
			System.out.println("places为空");
			return null;
		}
	}

}
