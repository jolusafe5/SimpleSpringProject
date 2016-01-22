package org.packt.Spring.chapter2.ApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.packt.Spring.chapter2.setterinjection.ATM;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PayrollSystem {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService empService = (EmployeeServiceImp) context.getBean("empServiceBean");
		System.out.println("Unique Employee Id: " + empService.generateEmployeeId());
		
		org.packt.Spring.chapter2.setterinjection.Employee employee = (org.packt.Spring.chapter2.setterinjection.Employee) context.getBean("employee");
		System.out.println(employee.toString());
		
		List lists= employee.getLists();
		Set sets = employee.getSets();
		Map maps = employee.getMaps();
		
		
		for(Object family:lists){
			System.out.println("Family: " + (String)family);
		}
		
		Iterator setsIterator = sets.iterator();
		while(setsIterator.hasNext()){
			String family=(String)setsIterator.next();
			System.out.println("Family: " + (String)family);
		}
		
		System.out.println("Brother 1: " + (String) maps.get("brother 1"));
		System.out.println("Brother 2: " + (String) maps.get("brother 2"));
		
		ATM atm= (ATM) context.getBean("atmBean");
		
		System.out.println("ATM printer message "); 
		atm.getPrinter().printBalance("5234672");
		
		org.packt.Spring.chapter2.beaninheritance.Employee employeeA= (org.packt.Spring.chapter2.beaninheritance.Employee) context.getBean("employeeBean");
		System.out.println("employeeBean "+employeeA.toString());
		
		org.packt.Spring.chapter2.beaninheritance.Employee mexicanEmployee= (org.packt.Spring.chapter2.beaninheritance.Employee)context.getBean("mexicanEmployee");
		System.out.println("mexicanEmployee "+mexicanEmployee.toString());
		
	}
}
