package com.springcore.lifecycle;

public class Sweets {
	private String sweetName;

	public String getSweetName() {
		return sweetName;
	}

	public void setSweetName(String sweetName) {
		this.sweetName = sweetName;
	}

	public Sweets() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sweets [sweetName=" + sweetName + "]";
	}
	
	public void init() {
		System.out.println("spring container intialize bean");
	}
	public void destroye() {
		System.out.println("spring container destroyed");
	}

}
