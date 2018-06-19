package com.k.demo.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * created by wyk
 * 2018/6/19
 **/
@Configuration
public class AppConfig {

	@Bean
	public String bs(){
		System.out.println("bs");
		return "";
	}

	@Bean
	//如果DataTypeCondition的match返回false，则该bean不会被实例化
	@Conditional(DataTypeCondition.class)
	public String condition(){
		System.out.println("condition");
		return "condition";
	}
}
