package com.technocrat.spark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.technocrat.spark.pojo.Word;
import com.technocrat.spark.service.MLService;

@RestController
public class MLController {
	
	@Autowired
	private MLService service;
	
	@RequestMapping(value="/wordcount", method=RequestMethod.GET)
	public void performRequest() {
		service.performRequest();
	}
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Spark Spring Application";
	}

}
