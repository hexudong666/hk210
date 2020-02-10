package com.hexudong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hexudong.service.DemoService;

@Controller
public class DemoComtroller {

	@Autowired
	private DemoService service;
	
	@RequestMapping("list")
	private String getList() {
		return "list";
	}
}
