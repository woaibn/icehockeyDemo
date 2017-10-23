package com.icehockey.entity;

public class Handling {
	private int handlingId;// 持杆方式Id
	private String handlingName;// 持杆方式名称
	private String handlingValue;// 持杆方式简称

	public int getHandlingId() {
		return handlingId;
	}

	public void setHandlingId(int handlingId) {
		this.handlingId = handlingId;
	}

	public String getHandlingName() {
		return handlingName;
	}

	public void setHandlingName(String handlingName) {
		this.handlingName = handlingName;
	}

	public String getHandlingValue() {
		return handlingValue;
	}

	public void setHandlingValue(String handlingValue) {
		this.handlingValue = handlingValue;
	}

	@Override
	public String toString() {
		return "Handling [handlingId=" + handlingId + ", handlingName="
				+ handlingName + ", handlingValue=" + handlingValue + "]";
	}

	public Handling(int handlingId, String handlingName, String handlingValue) {
		super();
		this.handlingId = handlingId;
		this.handlingName = handlingName;
		this.handlingValue = handlingValue;
	}

}
