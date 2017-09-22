package com.icehockey.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.icehockey.entity.Place;
import com.icehockey.util.DBUtil;

public class PlaceDao {
	Place place = null;
	List<Place> places=null;
	DBUtil util = new DBUtil();
	private ResultSet rs = null;
	private Statement statement = null;
	private Connection conn = null;
	private PreparedStatement preparedStatement = null;

	public Place getPlaceByPlaceName(String placeName) {
		String sql = "SELECT * FROM place where placeName=?;";
		System.out.println(sql);
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, placeName);
			System.out.println(sql);
			rs = preparedStatement.executeQuery();
			if (rs.next()) {
				System.out.println(sql);
				int placeId = rs.getInt("placeId");
				String logo = rs.getString("logo");
				placeName = rs.getString("placeName");
				String placeAddress = rs.getString("placeName");
				String placeNumber = rs.getString("placeNumber");
				String indoor = rs.getString("indoor");
				String changingRoom = rs.getString("changingRoom");
				String parkingLot = rs.getString("parkingLot");
				String trainingDegree = rs.getString("trainingDegree");
				int scale = rs.getInt("scale");
				String landTrainingRoom = rs.getString("landTrainingRoom");
				double area = rs.getDouble("area");
				double iceArea = rs.getDouble("iceArea");
				Date buildDate = rs.getDate("buildDate");
				Date useDate = rs.getDate("useDate");
				Date openDate = rs.getDate("openDate");
				String acceptIndividual = rs.getString("acceptIndividual");
				String linkman = rs.getString("linkman");
				String linkNumber = rs.getString("linkNumber");
				String email = rs.getString("email");
				String surface = rs.getString("surface");
				String organization = rs.getString("organization");
				String image = rs.getString("image");

				place = new Place(placeId, logo, placeName, placeAddress,
						placeNumber, indoor, changingRoom, parkingLot,
						trainingDegree, scale, landTrainingRoom, area, iceArea,
						buildDate, useDate, openDate, acceptIndividual,
						linkman, linkNumber, email, surface, organization,
						image);
				System.out.println(place);
			} else {
				System.out.println("俱乐部未找到");
				place = null;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return place;
	}

	public List<Place> getPlaces() {
		String sql = "SELECT * FROM place;";
		System.out.println(sql);
		places=new ArrayList<Place>();
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			System.out.println(sql);
			rs = preparedStatement.executeQuery();
			while (rs.next()) {
				System.out.println(sql);
				int placeId = rs.getInt("placeId");
				String logo = rs.getString("logo");
				String placeName = rs.getString("placeName");
				String placeAddress = rs.getString("placeAddress");
				String placeNumber = rs.getString("placeNumber");
				String indoor = rs.getString("indoor");
				String changingRoom = rs.getString("changingRoom");
				String parkingLot = rs.getString("parkingLot");
				String trainingDegree = rs.getString("trainingDegree");
				int scale = rs.getInt("scale");
				String landTrainingRoom = rs.getString("landTrainingRoom");
				double area = rs.getDouble("area");
				double iceArea = rs.getDouble("iceArea");
				Date buildDate = rs.getDate("buildDate");
				Date useDate = rs.getDate("useDate");
				Date openDate = rs.getDate("openDate");
				String acceptIndividual = rs.getString("acceptIndividual");
				String linkman = rs.getString("linkman");
				String linkNumber = rs.getString("linkNumber");
				String email = rs.getString("email");
				String surface = rs.getString("surface");
				String organization = rs.getString("organization");
				String image = rs.getString("image");

				place = new Place(placeId, logo, placeName, placeAddress,
						placeNumber, indoor, changingRoom, parkingLot,
						trainingDegree, scale, landTrainingRoom, area, iceArea,
						buildDate, useDate, openDate, acceptIndividual,
						linkman, linkNumber, email, surface, organization,
						image);
				System.out.println(place);
				places.add(place);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return places;
	}

	public List<Place> getPlaces2(String placeName) {
		String sql = "SELECT * FROM place where placeName=?;";
		places=new ArrayList<Place>();
		try {
			conn = util.openConnection();
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, placeName);
			System.out.println(sql);
			rs = preparedStatement.executeQuery();
			while (rs.next()) {
				System.out.println("bbbbbbbbbbbbbbbbbb");
				int placeId = rs.getInt("placeId");
				String logo = rs.getString("logo");
				placeName = rs.getString("placeName");
				String placeAddress = rs.getString("placeAddress");
				String placeNumber = rs.getString("placeNumber");
				String indoor = rs.getString("indoor");
				String changingRoom = rs.getString("changingRoom");
				String parkingLot = rs.getString("parkingLot");
				String trainingDegree = rs.getString("trainingDegree");
				int scale = rs.getInt("scale");
				String landTrainingRoom = rs.getString("landTrainingRoom");
				double area = rs.getDouble("area");
				double iceArea = rs.getDouble("iceArea");
				Date buildDate = rs.getDate("buildDate");
				Date useDate = rs.getDate("useDate");
				Date openDate = rs.getDate("openDate");
				String acceptIndividual = rs.getString("acceptIndividual");
				String linkman = rs.getString("linkman");
				String linkNumber = rs.getString("linkNumber");
				String email = rs.getString("email");
				String surface = rs.getString("surface");
				String organization = rs.getString("organization");
				String image = rs.getString("image");

				place = new Place(placeId, logo, placeName, placeAddress,
						placeNumber, indoor, changingRoom, parkingLot,
						trainingDegree, scale, landTrainingRoom, area, iceArea,
						buildDate, useDate, openDate, acceptIndividual,
						linkman, linkNumber, email, surface, organization,
						image);
				System.out.println(place);
				places.add(place);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return places;
	}

}
