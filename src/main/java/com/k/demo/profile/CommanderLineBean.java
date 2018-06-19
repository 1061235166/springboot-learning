package com.k.demo.profile;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

/**
 * created by wyk
 * 2018/6/19
 **/
@Service
public class CommanderLineBean implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println(args);
	}
}
