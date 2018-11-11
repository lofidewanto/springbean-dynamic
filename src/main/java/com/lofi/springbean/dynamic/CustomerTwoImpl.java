package com.lofi.springbean.dynamic;

import org.springframework.stereotype.Component;

@Component("customerTwo")
public class CustomerTwoImpl implements Customer {

	@Override
	public String getName() {
		return "Customer Two";
	}

}
