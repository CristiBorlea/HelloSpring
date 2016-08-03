package com.javapoint;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");
		int status = dao.saveEmployee(new Employee(102,"Amit", new BigDecimal(35000.0)));
		int status2 = dao.saveEmployee(new Employee(100,"Mihai",new BigDecimal(20000.0)));
		int status3 = dao.saveEmployee(new Employee(99,"Robert",new BigDecimal(24000.6)));
		int status4 = dao.saveEmployee(new Employee(101,"Cristi",new BigDecimal(50000.5)));
		List<Employee> list = dao.getAll();
		for (Employee employee : list) {
			System.out.println(employee.getName());
	
		
		List<Employee> list1 = dao.getEmployee("Amit");
		for (Employee employee2 : list1) { 
			System.out.println(employee2.getName());
		}
		dao.getAll();
		System.out.println(status);
		System.out.println(status2+status3+status4);
		

		/*
		 * int status=dao.updateEmployee(new Employee(102,"Sonoo",15000));
		 * System.out.println(status);
		 */

		/*
		 * Employee e=new Employee(); e.setId(102); int
		 * status=dao.deleteEmployee(e); System.out.println(status);
		 */

	}


	}
	}