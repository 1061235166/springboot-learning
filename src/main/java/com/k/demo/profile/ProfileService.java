package com.k.demo.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


/**
 * created by wyk
 * 2018/6/19
 **/
@Service
public class ProfileService {

	@Autowired
	private Environment environment;


	@PostConstruct
	public void init(){
		String name = environment.getProperty("name", "213");
		System.out.println(name);
	}
}