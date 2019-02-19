package com.cg.eis.dao;

import com.cg.eis.bean.Employee;

public interface EmployeeDAO {
public String insertDetails(Employee e);
public Employee viewEmployee(int id) ;
public Employee fetchDetail(String insuranceScheme);
public void deleteDetail(int id);
public Employee sortDetail(Employee e);
}
