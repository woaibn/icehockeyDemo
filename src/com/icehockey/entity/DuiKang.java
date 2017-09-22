package com.icehockey.entity;

import java.util.Date;

public class DuiKang {
	private int duikangId;//对抗编号
	private int clubAId;//俱乐部A编号
	private int clubBId;//俱乐部B编号
	private String clubAName;//俱乐部A名称
	private String logoA;//俱乐部ALoGo
	private String clubBName;//俱乐部B名称
	private String logoB;//俱乐部BLoGo
	private Date onDate;//举办时间
	private String degree;//等级：如全国俱乐部联赛
	private String address;//举办地址
	private int star;//观看指数
	private int round;//第几轮

	public int getDuikangId() {
		return duikangId;
	}

	public void setDuikangId(int duikangId) {
		this.duikangId = duikangId;
	}

	public int getClubAId() {
		return clubAId;
	}

	public void setClubAId(int clubAId) {
		this.clubAId = clubAId;
	}

	public int getClubBId() {
		return clubBId;
	}

	public void setClubBId(int clubBId) {
		this.clubBId = clubBId;
	}

	public String getClubAName() {
		return clubAName;
	}

	public void setClubAName(String clubAName) {
		this.clubAName = clubAName;
	}

	public String getLogoA() {
		return logoA;
	}

	public void setLogoA(String logoA) {
		this.logoA = logoA;
	}

	public String getClubBName() {
		return clubBName;
	}

	public void setClubBName(String clubBName) {
		this.clubBName = clubBName;
	}

	public String getLogoB() {
		return logoB;
	}

	public void setLogoB(String logoB) {
		this.logoB = logoB;
	}

	public Date getOnDate() {
		return onDate;
	}

	public void setOnDate(Date onDate) {
		this.onDate = onDate;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	@Override
	public String toString() {
		return "DuiKang [duikangId=" + duikangId + ", clubAId=" + clubAId
				+ ", clubBId=" + clubBId + ", clubAName=" + clubAName
				+ ", logoA=" + logoA + ", clubBName=" + clubBName + ", logoB="
				+ logoB + ", onDate=" + onDate + ", degree=" + degree
				+ ", address=" + address + ", star=" + star + ", round="
				+ round + "]";
	}

	public DuiKang(int duikangId, int clubAId, int clubBId, String clubAName,
			String logoA, String clubBName, String logoB, Date onDate,
			String degree, String address, int star, int round) {
		super();
		this.duikangId = duikangId;
		this.clubAId = clubAId;
		this.clubBId = clubBId;
		this.clubAName = clubAName;
		this.logoA = logoA;
		this.clubBName = clubBName;
		this.logoB = logoB;
		this.onDate = onDate;
		this.degree = degree;
		this.address = address;
		this.star = star;
		this.round = round;
	}

	public DuiKang() {
		super();
	}

}
