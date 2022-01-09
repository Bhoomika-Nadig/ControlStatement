package com.spring.example.DAO;

import org.springframework.stereotype.Component;

@Component
public class Employee1 {
	
Employee1[] emplyoee=new Employee1[5];
public boolean save() {
	System.out.println("saving");
	return true;
}

}
