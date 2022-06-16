package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("per1")
public class Person {
	@Value("Sachi")
	private String personName;
	@Value("Odisha")
	private String personAddr;
	@Value("25")
	private int personAge;
	@Value("#{temp}")
	private List<String> personMobile;
	
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonAddr() {
		return personAddr;
	}
	public void setPersonAddr(String personAddr) {
		this.personAddr = personAddr;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public List<String> getPersonMobile() {
		return personMobile;
	}
	public void setPersonMobile(List<String> personMobile) {
		this.personMobile = personMobile;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAddr=" + personAddr + ", personAge=" + personAge
				+ ", personMobile=" + personMobile + "]";
	}
	
	
}
