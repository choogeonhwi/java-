package com.lgy.spring_6_1;

public class Family {
	private String papaName;
	private String mamiName;
	private String sisterName;
	private String bortherName;
	
	
	
	public Family(String papaName, String mamiName) {
		super();
		this.papaName = papaName;
		this.mamiName = mamiName;
	}
	public String getPapaName() {
		return papaName;
	}
	public void setPapaName(String papaName) {
		this.papaName = papaName;
	}
	public String getMamiName() {
		return mamiName;
	}
	public void setMamiName(String mamiName) {
		this.mamiName = mamiName;
	}
	public String getSisterName() {
		return sisterName;
	}
	public void setSisterName(String sisterName) {
		this.sisterName = sisterName;
	}
	public String getBortherName() {
		return bortherName;
	}
	public void setBortherName(String bortherName) {
		this.bortherName = bortherName;
	}
}
