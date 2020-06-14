package com.example.bootMVC.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


	@GetMapping("/")
	public String index(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Index MVC World %s!", name);
	}
}
