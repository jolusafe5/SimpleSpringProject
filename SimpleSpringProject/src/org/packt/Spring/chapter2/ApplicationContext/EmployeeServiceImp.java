package org.packt.Spring.chapter2.ApplicationContext;

public class EmployeeServiceImp implements EmployeeService {
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImp() {	}

	public EmployeeServiceImp(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public Long generateEmployeeId() {
		return System.currentTimeMillis();
	}

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	
	
}
