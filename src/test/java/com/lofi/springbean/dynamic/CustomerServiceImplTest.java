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
public class CustomerServiceImplTest {

	private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImplTest.class);

	@Autowired
	private CustomerServiceImpl customerService;

	@Test
	public void testGetDynamicCustomerWithAspect() {
		// Dynamic object creation
		logger.info("Dynamic Customer with Aspect: " + customerService.getDynamicCustomerWithAspect().getName());
	}

	@Test
	public void testGetDynamicCustomerWithMap() {
		// Object creation with Map
		logger.info("Dynamic Customer with Map: " + customerService.getDynamicCustomerWithMap().getName());
	}

}
