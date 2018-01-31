package com.amex.entities;

public class Tester extends Employee implements JobDescription{

	private Integer testerId=(int) (Math.random()/100);
	
	public void workHours() {
		workHours = 8;		
	}

	public void processSalary() {
		salary = 70000;		
	}

	public Integer getTesterId() {
		return testerId;
	}

	public void workToDo() {
		// TODO Auto-generated method stub
		
	}

	

}
