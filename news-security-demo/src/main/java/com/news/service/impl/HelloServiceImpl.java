package com.news.service.impl;

import org.springframework.stereotype.Service;

import com.news.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService{

	@Override
	public String greeting(String name) {
//		System.out.println("greeting hello" + name);
		return "say hello"+name;
	}
	
}
