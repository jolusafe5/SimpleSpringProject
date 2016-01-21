package org.packt.Spring.chapter2.ApplicationContext;

public class Employee {
	private String employeeName;
	private String employeeId;
	private int employeeAge;
	private boolean married;

	public Employee() {}
	
	public Employee(String employeeName, int employeeAge, boolean married) {
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.married = married;
	}

	public Employee(String employeeName, int employeeAge, String employeeId) {
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeId = employeeId;
	}

	public Employee(String employeeName, String employeeId, int employeeAge) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeAge = employeeAge;
	}

	@Override
	public String toString() {
		return "Employee Name: " + this.employeeName + " , Age:" + this.employeeAge + ", IsMarried: " + married;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}
	
	

}
