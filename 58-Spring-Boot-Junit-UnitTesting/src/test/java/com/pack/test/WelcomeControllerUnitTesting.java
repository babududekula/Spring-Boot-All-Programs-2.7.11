package com.pack.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.pack.controller.WelcomeController;
import com.pack.service.WelcomeService;

@WebMvcTest(value = WelcomeController.class)
public class WelcomeControllerUnitTesting 
{
	@MockBean
	private WelcomeService service;
	
	@Autowired
	private MockMvc mockMve;
	
	@Test
	public void test() throws Exception
	{
		// Defining Mock Obj Behavior
		when(service.welcomeMsg()).thenReturn("Welcome To Spring Boot");
		// Preparing Request from requestBuilder
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/welcome");
		// Sending Request
		MvcResult result = mockMve.perform(requestBuilder).andReturn();
		// get the response
		MockHttpServletResponse response = result.getResponse();
		// validate response status code
		int status = response.getStatus();
		assertEquals(200, status);
	}
}
