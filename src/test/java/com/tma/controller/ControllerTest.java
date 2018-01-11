package com.tma.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.tma.SaleProjectApplicationTests;


public class ControllerTest extends SaleProjectApplicationTests{
	@Autowired
	private WebApplicationContext webApplicationContext;
 
	private MockMvc mockMvc;
 
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
 
	@Test
	public void location() throws Exception {
		mockMvc.perform(get("/location")).andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"));
 
	}
	@Test
	public void product() throws Exception {
		mockMvc.perform(get("/product")).andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"));
 
	}
	@Test
	public void time() throws Exception {
		mockMvc.perform(get("/time")).andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"));
 
	}

}


