package org.prince.in;

import org.springframework.beans.factory.annotation.Value;

public class StudentInfo {

	@Value("${student.name}")
	private String name;
	
	@Value("${student.address}")
	private String address;

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + "]";
	}
	
	
}
