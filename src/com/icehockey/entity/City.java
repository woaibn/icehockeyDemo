package com.icehockey.entity;

public class City {
	private int cityId; // 城市编号
	private String cityName; // 城市名称
	private String remark; // 备注
	
	
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public City(int cityId, String cityName, String remark) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.remark = remark;
	}
	
	
	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName
				+ ", remark=" + remark + "]";
	}
	

}
