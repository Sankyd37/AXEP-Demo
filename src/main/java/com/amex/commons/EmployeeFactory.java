package com.amex.commons;

import org.json.simple.JSONObject;

import com.amex.entities.Developer;
import com.amex.entities.Employee;
import com.amex.entities.Tester;

/**
 * This class segregates Employee type objects into Developer, Tester 
 * and Manager based on Job Title.
 *
 */
public class EmployeeFactory {
	
	
	public Employee segregateEmployee(Object o) {

		JSONObject jObj = (JSONObject) o;
		Employee e = null;
		if(jObj.get("jobTitleName").equals(JobTitle.DEVELOPER.name())){
			e = new Developer();
			constructEmployee(e,jObj);
			processEmployeeDetails(e);
			return e;

		}else if(jObj.get("jobTitleName").equals(JobTitle.TESTER.name())){
			e = new Tester();
			constructEmployee(e,jObj);
			processEmployeeDetails(e);
			return e;

		}else if(jObj.get("jobTitleName").equals(JobTitle.MANAGER.name())){
			e = new Tester();
			constructEmployee(e,jObj);
			processEmployeeDetails(e);
			return e;
		}else{
			return e;
		}
		
	}


	private void processEmployeeDetails(Employee e) {
		e.workHours();
		e.processSalary();
	}

	private void constructEmployee(Employee e, JSONObject jObj) {
		
		e.setEmailAddress(jObj.get("emailAddress").toString());
		e.setEmployeeCode(jObj.get("employeeCode").toString());
		e.setFirstName(jObj.get("firstName").toString());
		e.setJobTitleName(jObj.get("jobTitleName").toString());
		e.setLastName(jObj.get("lastName").toString());
		e.setPhoneNumber(jObj.get("phoneNumber").toString());
		e.setPreferredFullName(jObj.get("preferredFullName").toString());
		e.setRegion(jObj.get("region").toString());
		e.setUserId(jObj.get("userId").toString());
		
	}

}
