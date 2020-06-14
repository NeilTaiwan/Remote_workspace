package com.example.bootMVC.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {


	@GetMapping("/data")
	public String get(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Data", name);
	}
	
	@GetMapping("/dataList")
	public String list(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Data List", name);
	}
	
	@GetMapping("/dataList2")
	public String list2(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Data List2", name);
	}
}
