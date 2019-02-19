package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Service sc=new Service();
		System.out.println("Enter the details of id,name,salary and designation of employee");
		Employee e=sc.setDetals(s.nextInt(),s.next(),s.nextInt(),s.next());
		sc.insuranceScheme(e.getSalary(), e.getDesignation());
		sc.getDetails();
	}

}
