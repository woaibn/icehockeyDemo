package com.icehockey.entity;

public class Country {
	private int countryId; // 国籍编号
	private String countryName; // 国籍名称
	private String remark; // 备注
	
	
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(int countryId, String countryName, String remark) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.remark = remark;
	}
	
	
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName="
				+ countryName + ", remark=" + remark + "]";
	}
	

}
