package com;

public class Developer extends Employee{
	
	private String tech;
	
	void setDeveloper (String tech) {
		
		this.tech = tech;
	}
	
	void disDeveloper() {
//		System.out.println("Developer details");
		System.out.println("Technology "+tech);
	}

}
