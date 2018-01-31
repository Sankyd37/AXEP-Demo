package com.amex.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class Employee {

	//@JsonProperty("userId")
	private String userId;
	
	//@JsonProperty("jobTitleName")
	private String jobTitleName;
	
	//@JsonProperty("firstName")
	private String firstName;
	
	//@JsonProperty("lastName")
	private String lastName;
	
	//@JsonProperty("preferredFullName")
	private String preferredFullName;
	
	//@JsonProperty("employeeCode")
	private String employeeCode;
	
	//@JsonProperty("region")
	private String region;
	
	//@JsonProperty("phoneNumber")
	private String phoneNumber;
	
	//@JsonProperty("emailAddress")
	private String emailAddress;
	
	protected Integer salary;
	
	protected Integer workHours;
	
	public Integer getWorkHours() {
		return workHours;
	}
	public void setWorkHours(Integer workHours) {
		this.workHours = workHours;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getJobTitleName() {
		return jobTitleName;
	}
	public void setJobTitleName(String jobTitleName) {
		this.jobTitleName = jobTitleName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPreferredFullName() {
		return preferredFullName;
	}
	public void setPreferredFullName(String preferredFullName) {
		this.preferredFullName = preferredFullName;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	public abstract void workHours();

	public abstract void processSalary();
}
