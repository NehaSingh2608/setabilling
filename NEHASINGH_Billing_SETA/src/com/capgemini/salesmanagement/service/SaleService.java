package com.capgemini.salesmanagement.service;

import java.util.Map;

import com.capgemini.salemanagement.dao.SaleDAO;
import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exception.InvalidCategoryException;
import com.capgemini.salesmanagement.exception.InvalidPriceException;
import com.capgemini.salesmanagement.exception.InvalidProductIdException;
import com.capgemini.salesmanagement.exception.InvalidProductNameException;
import com.capgemini.salesmanagement.exception.InvalidQuantityException;


public class SaleService implements ISaleService{
	SaleDAO repo=new SaleDAO();
	
	public SaleService() {
		repo = new SaleDAO();
	}


	@Override
	public Map<Integer, Sale> insertSalesDetails(Sale sale) {

		//if(validateProductCode(int productId) && validateQuantity(int qty) && validateProductCat(String prodCat) &&validateProductName(String prodName) &&validateProductPrice(float price))
		{
		 Sale sale1 =new Sale();
		repo.insertSalesDetails(sale1);
		}
		
		return (Map<Integer, Sale>) sale;	
	}

	@Override
	
	public boolean validateProductCode(int productId) {
		if(productId!=1001||productId!=1002||productId!=1003||productId!=1004)
					throw new InvalidProductIdException( "Sorry, id is not correct" );
		return true;
		}
	
	

	@Override
	public boolean validateQuantity(int qty) {
		if(!(qty>0 && qty<5))
			throw new InvalidQuantityException( "Sorry, quantity is not correct" );
		return true;
		
	}

	@Override
	public boolean validateProductCat(String prodCat) {
		if(prodCat==null)
			throw new InvalidCategoryException( "Sorry, Category is null" );
		if(prodCat!="Electronic" || prodCat!="Toy" )
			throw new InvalidCategoryException( "Sorry, Category is not correct" );
		return true;
	}

	@Override
	public boolean validateProductName(String prodName) {
		if(prodName!="Tv"||prodName!="Smart Phone" || prodName!="Video Game" ||prodName!="Soft Toy"||prodName!="Telescope"||prodName!="Barbee Doll")
			throw new InvalidProductNameException( "Sorry, prod name is not correct" );
		return true;
	}

	@Override
	public boolean validateProductPrice(float price) {
		if(!(price>200))
				throw new InvalidPriceException( "Sorry, price is not valid" );
		return true;
	}

}
