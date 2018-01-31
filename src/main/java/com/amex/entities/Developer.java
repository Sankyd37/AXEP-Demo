package com.amex.entities;

public class Developer extends Employee implements JobDescription{

	private Integer developerId = (int) (Math.random()/100);
	
	
	public Integer getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(Integer developerId) {
		this.developerId = developerId;
	}

	public void workHours() {
		workHours=9;
		
	}

	public void processSalary() {
		salary=80000;
		
	}

	public void workToDo() {
		// TODO Auto-generated method stub
		
	}

}
