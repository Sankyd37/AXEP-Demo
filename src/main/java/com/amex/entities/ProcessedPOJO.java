package com.amex.entities;

public class ProcessedPOJO {

	private String empName;
	private String salary;
	private String workHours;
	private String empId;
	
	public String getEmpName() {
		return processedString(empName);
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getSalary() {
		return processedString(salary);
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getWorkHours() {
		return processedString(workHours);
	}
	public void setWorkHours(String workHours) {
		this.workHours = workHours;
	}
	public String getEmpId() {
		return processedString(empId);
	}
	private String processedString(String s) {
		// TODO Auto-generated method stub
		return "\""+s+"\"";
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("{");
		sb.append("\"employeeId\":").append(getEmpId()).append(",")
		.append("\"employeeName\":").append(getEmpName()).append(",")
		.append("\"salary\":").append(getSalary()).append(",")
		.append("\"workHours\":").append(getWorkHours()).append("}");
		
		return sb.toString();
	}
	
}
