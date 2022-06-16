package com.springcore.ci;

public class Document {
	public String docName;

	public Document(String docName) {
		super();
		this.docName = docName;
	}

	@Override
	public String toString() {
		return this.docName;
	}
	
	
}
