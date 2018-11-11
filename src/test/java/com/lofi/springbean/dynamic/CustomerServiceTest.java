package com.lofi.springbean.dynamic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {

	private static final Logger logger = LoggerFactory.getLogger(CustomerServiceTest.class);

	@Autowired
	private CustomerServiceImpl customerService;

	@Test
	public void testGetDynamicCustomer() {
		// Dynamic object creation
		logger.info("Dynamic Customer: " + customerService.getDynamicCustomer().getName());
	}

}
