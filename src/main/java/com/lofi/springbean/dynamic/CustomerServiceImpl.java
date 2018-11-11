package com.lofi.springbean.dynamic;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl {

	private Customer dynamicCustomerWithAspect;
	
	// We inject the customer implementations into a Map
    @Autowired
    private Map<String, Customer> dynamicCustomerWithMap;
    
    // This comes from the property file as a key for the Map
    @Value("${dynamic.object.name}")
	private String object;

	@InjectDynamicObject
	public Customer getDynamicCustomerWithAspect() {
		return this.dynamicCustomerWithAspect;
	}
    
    public Customer getDynamicCustomerWithMap() {
        return this.dynamicCustomerWithMap.get(object);
    }

}
