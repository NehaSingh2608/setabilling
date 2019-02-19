package com.capgemini.salemanagement.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.service.SaleService;
import com.capgemini.salesmanagement.util.CollectionUtil;


//this layer directly communiccate with ui inteface 

public class SaleDAO implements ISaleDAO{
	public Map<Integer,Sale> sale2=new HashMap<>();
	SaleService service;
	SaleDAO dao=new SaleDAO();
	Sale sale;
	CollectionUtil util=new CollectionUtil();
	
	
	int salesId;
	public int salesId()
	{
		salesId=(int) Math.random();
		return salesId;
	}
	@Override
	public Map<Integer, Sale> insertSalesDetails(Sale sale) {
		
		for(Sale m : util.getsaleCollection(sale).values())
		{
			System.out.println(  +m.getSaleId()+"     |     "+m.getProdCode()+"     |     "+m.getProductName()+"     |     "+m. getCategory()+"   |    "+m.getSaleDate()+"  |   "+m.getQuantity()+"  |     "+m.getLineToatal());
					return (Map<Integer, Sale>) m;	
		}
		
	
	
		return util.getsaleCollection(sale);
	}
		

}
