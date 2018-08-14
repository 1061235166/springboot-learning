package com.k.demo;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		Object demoBeanFactory = applicationContext.getBean("demoBeanFactory");

		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

		Arrays.stream(beanDefinitionNames).forEach((beanName)->{
			System.out.println(beanName+"	|||||||||||		"+applicationContext.getBean(beanName).getClass());
		});

		JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");

		String[] bea1s = applicationContext.getAliases("b1");
		System.out.println(String.join(",",bea1s));

		Object b1 = applicationContext.getBean("b1");
		System.out.println(b1);
	}
}
