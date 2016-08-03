package com.javapoint;

import java.math.BigDecimal;

public class Employee {
	private int id;
	private String name;
	private BigDecimal salary;

	public int getId() {
		return id;
	}

	public Employee(int id, String name, BigDecimal salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	// no-arg and parameterized constructors
	// getters and setters
}
