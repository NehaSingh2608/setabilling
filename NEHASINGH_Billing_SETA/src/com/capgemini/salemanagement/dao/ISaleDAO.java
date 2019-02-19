package com.capgemini.salemanagement.dao;

import java.util.Map;


import com.capgemini.salesmanagement.bean.Sale;

//It is the inteface of dao layer that take map input

public interface ISaleDAO {
	public Map<Integer,Sale> insertSalesDetails(Sale sale);
	
}
