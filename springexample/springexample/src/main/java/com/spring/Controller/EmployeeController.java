package com.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.example.DAO.Employee1;
import com.spring.example.DTO.Employee;

@RestController
public class EmployeeController {

@Autowired
Employee1 dao;

@GetMapping("get")
public boolean getName() {
	return true;
}
@PostMapping("add")
private Employee savedata(Employee dto) {
	dao.save();
	return dto;
}




}
