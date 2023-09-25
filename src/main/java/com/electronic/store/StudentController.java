package com.electronic.store;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class StudentController {

	@GetMapping("/create")
	public String createUser()
	{
		return "hii soham";
	}
}
