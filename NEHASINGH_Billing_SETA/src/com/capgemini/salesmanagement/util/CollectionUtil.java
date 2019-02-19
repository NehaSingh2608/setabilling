package com.capgemini.salesmanagement.util;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.salesmanagement.bean.Sale;	


//It get the collection of sales that are happened and store it
public class CollectionUtil {
	private static Map<Integer,Sale>  sales=new HashMap<>();

	public static Map<Integer,Sale> getsaleCollection(Sale sale)
	{
		
		return (Map<Integer, Sale>) sale;
	}
}
