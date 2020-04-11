package com.nabin.jenkins.api;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

	Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	@Test
	public void contextLoads() {
		logger.info("Test case executing");
		logger.info("Test case executing second log statement ...");
		assertEquals(true, true);
	}

}
