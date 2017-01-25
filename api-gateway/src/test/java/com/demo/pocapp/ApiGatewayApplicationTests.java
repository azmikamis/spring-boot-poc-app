package com.demo.pocapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.pocapp.ApiGatewayApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApiGatewayApplication.class)
public class ApiGatewayApplicationTests {

	@Test
	public void contextLoads() {
	}

}
