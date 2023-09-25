package com.electronic.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hii")
public class Product {
	
	@GetMapping("/get/{id}/{name}")
	public String add(
			@PathVariable int id,
			@PathVariable String name
			)
	{
		System.out.println(id);
		System.out.println(name);
		return "this is testing";
	}

	
	@GetMapping("/hello")
	public String test(
			@RequestParam int id,
			@RequestParam String name
			)
	{
		System.out.println(id);
		System.out.println(name);
		return "success";
	}
}
