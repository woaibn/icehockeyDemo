package com.icehockey.entity;

import java.util.Date;

public class User {

	private int userId;// 用户编号
	private String weChatId;// 微信账号
	private String telephone;// 手机号码',
	private String userName;// 用户姓名',
	private String sex;// 1代表男生0表示女生,默认为1男生',man是男生，lady是女生
	private String password;// 密码
	private Date birthday;// 出生日期
	private String country;// 国籍
	private String city;// 城市
	private double height;// 身高
	private double weight;// 体重
	private String play;// 爱好：玩雪，玩冰，都玩
	private String ice_play;// 游戏项目
	private String snow_play;// 单板，双板，都玩
	private String role;// 角色编号
	private String handling;// 持杆方式编号
	private String image;// 头像

	public User() {
		super();
	}

	public User(int userId, String weChatId, String telephone, String userName,
			String sex, String password, Date birthday, String country,
			String city, double height, double weight, String play,
			String ice_play, String snow_play, String role, String handling,
			String image) {
		super();
		this.userId = userId;
		this.weChatId = weChatId;
		this.telephone = telephone;
		this.userName = userName;
		this.sex = sex;
		this.password = password;
		this.birthday = birthday;
		this.country = country;
		this.city = city;
		this.height = height;
		this.weight = weight;
		this.play = play;
		this.ice_play = ice_play;
		this.snow_play = snow_play;
		this.role = role;
		this.handling = handling;
		this.image = image;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getPlay() {
		return play;
	}

	public void setPlay(String play) {
		this.play = play;
	}

	public String getIce_play() {
		return ice_play;
	}

	public void setIce_play(String ice_play) {
		this.ice_play = ice_play;
	}

	public String getSnow_play() {
		return snow_play;
	}

	public void setSnow_play(String snow_play) {
		this.snow_play = snow_play;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getHandling() {
		return handling;
	}

	public void setHandling(String handling) {
		this.handling = handling;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", weChatId=" + weChatId
				+ ", telephone=" + telephone + ", userName=" + userName
				+ ", sex=" + sex + ", password=" + password + ", birthday="
				+ birthday + ", country=" + country + ", city=" + city
				+ ", height=" + height + ", weight=" + weight + ", play="
				+ play + ", ice_play=" + ice_play + ", snow_play=" + snow_play
				+ ", role=" + role + ", handling=" + handling + ", image="
				+ image + "]";
	}

}
