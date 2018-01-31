package com.amex.commons;

import java.util.ArrayList;
import java.util.List;

import com.amex.entities.Employee;
import com.amex.entities.ProcessedPOJO;


/**
 * Maps the processed Employee object with Response POJO and reconverts it into JSON.
 *
 */
public class JavaToJSONConvertor {

	public String toJSON(List<Employee> empList) {
		String jsonString=Constants.ARRAYLIST_START;
		int count =1;
		for(Employee emp : empList){
			ProcessedPOJO p = new ProcessedPOJO();
			setProcessedPojo(emp,p);
			jsonString = jsonString+p.toString();
			if(count<empList.size()){
				jsonString = jsonString+Constants.SEPARATOR;
			}
		}
		
		jsonString=jsonString+Constants.ARRAYLIST_END;
		return jsonString;

}

	private void setProcessedPojo(Employee emp, ProcessedPOJO p) {

		p.setEmpId(emp.getEmployeeCode());
		p.setEmpName(emp.getPreferredFullName());
		p.setSalary(emp.getSalary().toString());
		p.setWorkHours(emp.getWorkHours().toString());
		
	}
}