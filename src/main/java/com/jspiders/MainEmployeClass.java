package com.jspiders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployeClass {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		
		Employee employee = (Employee) applicationContext.getBean("myEmploye");
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getQualification());
		System.out.println(employee.getMail());
		System.out.println(employee.getPno());

	}

}
