package com.hexudong.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.hexudong.mapper.DemoMapper;
import com.hexudong.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoMapper mapper;
	
}
