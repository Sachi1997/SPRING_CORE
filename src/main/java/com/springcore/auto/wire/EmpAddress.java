package com.springcore.auto.wire;

public class EmpAddress {
	private Address addr;

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public EmpAddress(Address addr) {
		super();
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
