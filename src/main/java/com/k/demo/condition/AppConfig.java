package com.k.demo.condition;

import com.k.demo.entity.Bean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * created by wyk
 * 2018/6/19
 **/
@Configuration
public class AppConfig {

	@Configuration
	class InnerConfig{
		@Bean
		public String see(){
			System.out.println("See");
			return "see";
		}
	}

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

	@Bean(name = {"b1","be1","bea1"})
	public Bean1 bean1(){
		return new Bean1();
	}
}
