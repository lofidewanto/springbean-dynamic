package com.lofi.springbean.dynamic;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl {

	private Customer dynamicCustomer;

	@InjectDynamicObject
	public Customer getDynamicCustomer() {
		return this.dynamicCustomer;
	}

}
