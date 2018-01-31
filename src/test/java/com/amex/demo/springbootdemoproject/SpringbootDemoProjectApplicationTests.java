package com.amex.demo.springbootdemoproject;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;

import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.amex.controller.RestGetController;
import com.amex.entities.ProcessedPOJO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemoProjectApplicationTests {

	  private MockMvc mockMvc;
	  
	  @InjectMocks
	  private RestGetController restGetController;
	  
	    @Autowired
	    private WebApplicationContext webApplicationContext;
	
	@Test
	public void contextLoads() {
	}


    @Before
    public void setup() throws Exception {
    	 MockitoAnnotations.initMocks(this);
         mockMvc = MockMvcBuilders
                 .standaloneSetup(restGetController)
                 .build();
 }
	
	
	@Test
	public void sanityTest() {
		
		ProcessedPOJO pojo = new ProcessedPOJO();
		pojo.setEmpId("E1");
		pojo.setEmpName("Sanket");
		pojo.setSalary("80000");
		pojo.setWorkHours("9");
		
		try {
			mockMvc.perform(get("/getEmployeeList"))
			.andExpect(status().isOk());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 verify(restGetController, times(1)).getEmployeeList("User1");
		 verifyNoMoreInteractions(restGetController);
		
	}
	
}
