package com.springcore.auto.wire;

public class Address {
	private String city;
	private String street;
	private int zip;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public Address(String city, String street, int zip) {
		super();
		this.city = city;
		this.street = street;
		this.zip = zip;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", zip=" + zip + "]";
	}
	
	

}
