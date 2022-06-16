package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> empNo;
	private Set<String> empAddress;
	private Map<String,String> empCourses;
	private Properties props;
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getEmpNo() {
		return empNo;
	}
	public void setEmpNo(List<String> empNo) {
		this.empNo = empNo;
	}
	public Set<String> getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(Set<String> empAddress) {
		this.empAddress = empAddress;
	}
	public Map<String, String> getEmpCourses() {
		return empCourses;
	}
	public void setEmpCourses(Map<String, String> empCourses) {
		this.empCourses = empCourses;
	}
	public Emp(String name, List<String> empNo, Set<String> empAddress, Map<String, String> empCourses) {
		super();
		this.name = name;
		this.empNo = empNo;
		this.empAddress = empAddress;
		this.empCourses = empCourses;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
