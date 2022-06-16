package com.springcore.referencetype;

public class First {
	private int a;
	private Second sec;
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public Second getSec() {
		return sec;
	}
	public void setSec(Second sec) {
		this.sec = sec;
	}
	public First(int a, Second sec) {
		super();
		this.a = a;
		this.sec = sec;
	}
	public First() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "First [a=" + a + ", sec=" + sec + "]";
	}
	
	
}
