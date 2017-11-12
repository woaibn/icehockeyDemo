package com.icehockey.entity;

import java.util.Date;

public class Competition {
	private int id; // 赛事编号
	private int teamAId; // 球队A编号
	private int teamBId; // 球队B编号
	private int rinkId; // 比赛场地编号
	private Date competitionTime; // 比赛时间
	private int competitionDegree; // 比赛等级
	private int round; // 轮次
	private String competitionType; // 赛事类型
	private int degreeId; //等价编号
	private String remark; // 备注
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTeamAId() {
		return teamAId;
	}
	public void setTeamAId(int teamAId) {
		this.teamAId = teamAId;
	}
	public int getTeamBId() {
		return teamBId;
	}
	public void setTeamBId(int teamBId) {
		this.teamBId = teamBId;
	}
	public int getRinkId() {
		return rinkId;
	}
	public void setRinkId(int rinkId) {
		this.rinkId = rinkId;
	}
	public Date getCompetitionTime() {
		return competitionTime;
	}
	public void setCompetitionTime(Date competitionTime) {
		this.competitionTime = competitionTime;
	}
	public int getCompetitionDegree() {
		return competitionDegree;
	}
	public void setCompetitionDegree(int competitionDegree) {
		this.competitionDegree = competitionDegree;
	}
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		this.round = round;
	}
	public String getCompetitionType() {
		return competitionType;
	}
	public void setCompetitionType(String competitionType) {
		this.competitionType = competitionType;
	}
	public int getDegreeId() {
		return degreeId;
	}
	public void setDegreeId(int degreeId) {
		this.degreeId = degreeId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	public Competition() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Competition(int id, int teamAId, int teamBId, int rinkId,
			Date competitionTime, int competitionDegree, int round,
			String competitionType, int degreeId, String remark) {
		super();
		this.id = id;
		this.teamAId = teamAId;
		this.teamBId = teamBId;
		this.rinkId = rinkId;
		this.competitionTime = competitionTime;
		this.competitionDegree = competitionDegree;
		this.round = round;
		this.competitionType = competitionType;
		this.degreeId = degreeId;
		this.remark = remark;
	}
	
	
	@Override
	public String toString() {
		return "Competition [id=" + id + ", teamAId=" + teamAId + ", teamBId="
				+ teamBId + ", rinkId=" + rinkId + ", competitionDegree="
				+ competitionDegree + ", round=" + round + ", competitionType="
				+ competitionType + ", degreeId=" + degreeId + ", remark="
				+ remark + "]";
	}
	

}
