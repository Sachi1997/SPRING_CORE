package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("notebook")
public class Notebook {
	@Value("#{10+3}")	
	private int a;
	@Value("#{19+54-24}")
	private int b;
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double c;
	@Value("#{new java.lang.String('Sachidananda')}")
	private String NoteName;
	
	public String getNoteName() {
		return NoteName;
	}
	public void setNoteName(String noteName) {
		NoteName = noteName;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void setA(int a) {
		this.a = a;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Notebook [a=" + a + ", b=" + b + ", c=" + c + ", NoteName=" + NoteName + "]";
	}
	
	
	
}
