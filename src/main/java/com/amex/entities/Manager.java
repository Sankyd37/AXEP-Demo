package com.amex.entities;

public class Manager extends Employee implements JobDescription{

	private Integer managerId = (int) (Math.random()/100);
	
	public void workHours() {
		workHours = 10;
	}

	public void processSalary() {
		
		salary=100000;
		
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public void workToDo() {
		// TODO Auto-generated method stub
		
	}

	
}
