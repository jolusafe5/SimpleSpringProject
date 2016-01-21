package org.packt.Spring.chapter2.ApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PayrollSystem {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService empService = (EmployeeServiceImp) context.getBean("empServiceBean");
		System.out.println("Unique Employee Id: " + empService.generateEmployeeId());
		
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee.toString());
		
		
		
		
	}
}
