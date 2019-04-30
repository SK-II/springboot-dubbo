package com.ysl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ysl.inteface.IndexService;

@RestController
public class IndexController {
	
	@Autowired
	private IndexService indexService;
	
	@GetMapping("/index")
	public void index() {
		System.out.println(indexService.index());
	}
	
	
}
