package com.k.demo.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * created by wyk
 * 2018/6/19
 **/
public class DataTypeCondition implements Condition {

	@Override
	public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
		String property = conditionContext.getEnvironment().getProperty("spring.datasource.driver-class-name");
		return false;
	}
}
