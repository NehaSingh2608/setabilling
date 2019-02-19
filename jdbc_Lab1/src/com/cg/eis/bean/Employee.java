package com.cg.eis.bean;

public class Employee {
         int id;
      String Name;
      int salary;
      String Designation;
      String insuranceScheme;
      public Employee(int id,String Name,int salary,String Designation) {
    	  this.id=id;
    	  this.Name=Name;
    	  this.salary=salary;
    	  this.Designation=Designation;
      }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
     
}
