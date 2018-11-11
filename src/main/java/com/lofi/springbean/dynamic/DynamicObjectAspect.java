package com.lofi.springbean.dynamic;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DynamicObjectAspect {

	// This comes from the property file
	@Value("${dynamic.object.name}")
	private String object;

	@Autowired
	private ApplicationContext applicationContext;

	@Pointcut("execution(@com.lofi.springbean.dynamic.InjectDynamicObject * *(..))")
	public void beanAnnotatedWithInjectDynamicObject() {
	}

	@Around("beanAnnotatedWithInjectDynamicObject()")
	public Object adviceBeanAnnotatedWithInjectDynamicObject(ProceedingJoinPoint pjp) throws Throwable {
		pjp.proceed();

		// Create the bean or object depends on the property file
		Object createdObject = applicationContext.getBean(object);
		return createdObject;
	}

}
