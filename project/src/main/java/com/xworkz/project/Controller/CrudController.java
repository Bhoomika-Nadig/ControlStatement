package com.xworkz.project.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudController {
	@GetMapping("getName")
	public String getName() {
		return"Bhoomika";
	}

}
