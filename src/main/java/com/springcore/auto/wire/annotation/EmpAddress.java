package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class EmpAddress {
	/* @Autowired */
	private Address addr;

	public Address getAddr() {
		return addr;
	}

	/* @Autowired */
	public void setAddr(Address addr) {
		System.out.println("Inside setter ::");
		this.addr = addr;
	}
	@Autowired
	public EmpAddress(Address addr) {
		
		super();
		System.out.println("inside constructor ::");
		this.addr = addr;
	}

	public EmpAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EmpAddress [addr=" + addr + "]";
	}
	
	
}
