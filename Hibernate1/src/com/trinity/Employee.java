package com.trinity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	private static final String IDENTITY = null;
	@Column(name = "ename")
	private String name;
	@Column(name = "eage")
	private int age;
	@Column(name = "eaddress")
	private String address;
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eno")
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address=" + address + ", id=" + id + "]";
	}

}
