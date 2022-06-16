package com.springcore.springcore;

public class Lawyer {
	private int lawyerID;
	private String lawyerName;
	private String lawyerAddress;
	public int getLawyerID() {
		return lawyerID;
	}
	public void setLawyerID(int lawyerID) {
		this.lawyerID = lawyerID;
	}
	public String getLawyerName() {
		return lawyerName;
	}
	public void setLawyerName(String lawyerName) {
		this.lawyerName = lawyerName;
	}
	public String getLawyerAddress() {
		return lawyerAddress;
	}
	public void setLawyerAddress(String lawyerAddress) {
		this.lawyerAddress = lawyerAddress;
	}
	public Lawyer(int lawyerID, String lawyerName, String lawyerAddress) {
		super();
		this.lawyerID = lawyerID;
		this.lawyerName = lawyerName;
		this.lawyerAddress = lawyerAddress;
	}
	public Lawyer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Lawyer [lawyerID=" + lawyerID + ", lawyerName=" + lawyerName + ", lawyerAddress=" + lawyerAddress + "]";
	}
	
}
