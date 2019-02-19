package com.cg.eis.service;
import com.cg.eis.bean.Employee;
import com.cg.eis.dao.EmployeeDAO;
import com.cg.eis.util.DBUTIL;

interface EmployeeServices {
	public String setDetals(int id,String name,int salary,String deg);
	public void insuranceScheme(int salary,String Designation);
	public Employee viewEmployee(int id);
	public Employee fetchDetail(String insuranceScheme);
}
public class Service implements EmployeeServices{
	
	EmployeeDAO dao;
	Employee e;
	
	@Override
	public String setDetals(int id, String name, int salary, String deg) {
		String detail;
		return detail=dao.insertDetails(e);
	}

	@Override
	public void insuranceScheme(int salary, String Designation) {
		// TODO Auto-generated method stub
		if(Designation.equals("System Associate") && (salary>5000 && salary <20000))
			e.setInsuranceScheme("C");
		else if(Designation.equals("Programmer") && (salary>20000 && salary <40000))
			e.setInsuranceScheme("B");
		else if(Designation.equals("Manager") && (salary>=40000))
			e.setInsuranceScheme("A");
		else if(Designation.equals("Clerk") && (salary<5000))
			e.setInsuranceScheme("No Scheme");
	}

	@Override
	public Employee viewEmployee(int id) {
		Employee emp=null;
		emp=dao.viewEmployee(id);
		return emp;
	}

	@Override
	public Employee fetchDetail(String insuranceScheme) {
		Employee emp1;
		emp1=dao.fetchDetail(insuranceScheme);
		return emp1;
	}	
}