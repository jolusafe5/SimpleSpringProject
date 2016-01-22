package org.packt.Spring.chapter2.setterinjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private List<Object> lists;
	private Set<Object> sets;
	private Map<Object, Object> maps;
	
	private String employeeName; 

	public void setLists(List<Object> lists) {
		this.lists = lists;
	}

	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}

	public void setMaps(Map<Object, Object> maps) {
		this.maps = maps;
	}

	public List<Object> getLists() {
		return lists;
	}

	public Set<Object> getSets() {
		return sets;
	}

	public Map<Object, Object> getMaps() {
		return maps;
	}
	
	public String toString(){
		return this.employeeName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
	
	
}
