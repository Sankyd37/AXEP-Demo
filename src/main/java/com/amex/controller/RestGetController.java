package com.amex.controller;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amex.commons.EmployeeFactory;
import com.amex.commons.JavaToJSONConvertor;
import com.amex.entities.Employee;

@RestController
@PropertySource(value = { "classpath:application.properties" })
public class RestGetController {

	// Read jason file name from application.properties file.
	@Value("${json.file.name}")
	private String jsonFileName;

	private EmployeeFactory empFactory = new EmployeeFactory();

	/**
	 *  getEmployeeList - Reads from specified JSON file and parses the file
	 *  to generate Employee object and segregates it into Employee sub classes/
	 */
	
	@RequestMapping("/getEmployeeList")
	public String getEmployeeList(
			@RequestParam(value = "userId", required = false) String userId) {

		JSONParser parser = new JSONParser();
		String outputJSON = "";

		try {
			// Reading JSON file present locally.
			File file = new ClassPathResource(jsonFileName).getFile();

			JSONArray jsonArray = new JSONArray();
			jsonArray = (JSONArray) parser.parse(new FileReader(file));

			List<Employee> empList = new ArrayList<Employee>();
			for (Object o : jsonArray) {
				if (o instanceof JSONObject) {
					String objUId = (String) ((JSONObject) o).get("userId");

					// Filter check for UserId
					if (userId != null) {
						if (objUId.equals(userId)) {
							String jobTitle = (String) ((JSONObject) o)
									.get("jobTitleName");
							empList.add(empFactory.segregateEmployee(o));
						}
					} else {
						String jobTitle = (String) ((JSONObject) o)
								.get("jobTitleName");
						empList.add(empFactory.segregateEmployee(o));
					}
				}
			}

			JavaToJSONConvertor jc = new JavaToJSONConvertor();
			outputJSON = jc.toJSON(empList);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return outputJSON;
	}

}