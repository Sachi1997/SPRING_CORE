package com.springcore.ci;

import java.util.List;

public class Person {
	private String personName;
	private int personId;
	private Document doc;
	private List<String> lis;
	
	public Person(String personName,int personId,Document doc, List<String> lis) {
		this.personName=personName;
		this.personId=personId;
		this.doc=doc;
		this.lis=lis;
	}

	@Override
	public String toString() {		
		return this.personName+"::"+this.personId+":-"+this.doc.docName +"::::"+this.lis;
	}
	
	
}
