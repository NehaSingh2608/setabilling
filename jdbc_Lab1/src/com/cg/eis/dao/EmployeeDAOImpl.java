package com.cg.eis.dao;

import java.sql.Connection;

import com.capgemini.donorapplication.util.DBConnection;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;
import com.cg.eis.util.DBUTIL;

public class EmployeeDAOImpl implements EmployeeDAO{
	Service service=new Service();
	
	@Override
	public Employee fetchDetail(String insuranceScheme) {
		
		return null;
	}

	@Override
	public void deleteDetail(int id) {
		
		
	}

	@Override
	public Employee sortDetail(Employee e) {
		
		
		return null;
	}

	@Override
	public String insertDetails(Employee e) {
		Connection con = DBUTIL.getInstance().getConnection();	
		
		}
	@Override
	public Employee viewEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
