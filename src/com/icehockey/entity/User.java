package com.icehockey.entity;

import java.util.Date;

public class User {

	private int userId;// '用户编号',
	private String userName;// '用户姓名',
	private String weChatId;// '微信账号',
	private String telephone;// '电话号码',
	private String password;// '登录密码',
	private String roleId;// '角色编号',
	private boolean sex;// '性别',
	private Date birthday;// '出生日期',
	private String idType;// '证件类型',
	private int idInfoId;// '证件类型编号',
	private int countryId;// '国籍编号',
	private int cityId;// '籍贯编号',
	private String address;// '住址',
	private Date joinDate;// '注册时间',
	private String remark;// '备注',

	public User() {
		super();
	}

	public User(int userId, String userName, String weChatId, String telephone, String password, String roleId,
			boolean sex, Date birthday, String idType, int idInfoId, int countryId, int cityId, String address,
			Date joinDate, String remark) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.weChatId = weChatId;
		this.telephone = telephone;
		this.password = password;
		this.roleId = roleId;
		this.sex = sex;
		this.birthday = birthday;
		this.idType = idType;
		this.idInfoId = idInfoId;
		this.countryId = countryId;
		this.cityId = cityId;
		this.address = address;
		this.joinDate = joinDate;
		this.remark = remark;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getWeChatId() {
		return weChatId;
	}

	public void setWeChatId(String weChatId) {
		this.weChatId = weChatId;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public int getIdInfoId() {
		return idInfoId;
	}

	public void setIdInfoId(int idInfoId) {
		this.idInfoId = idInfoId;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", weChatId=" + weChatId + ", telephone="
				+ telephone + ", password=" + password + ", roleId=" + roleId + ", sex=" + sex + ", birthday="
				+ birthday + ", idType=" + idType + ", idInfoId=" + idInfoId + ", countryId=" + countryId + ", cityId="
				+ cityId + ", address=" + address + ", joinDate=" + joinDate + ", remark=" + remark + "]";
	}
	
	
}
