package com.capgemini.salesmanagement.ui;

import java.util.Scanner;



import com.capgemini.salesmanagement.service.SaleService;

//this is the user interface 

public class Client {

	public static void main(String[] args) {
		
		SaleService service=new SaleService();
		
		
			int choice=1;
			int prodCode;
			int quantity;
			String productName;
			String category;
			String ProDescription;
			double price;
			double lineTotal=0.0;
			
			
			
			Scanner scanner = new Scanner(System.in);
			
		
				System.out.println("1.Enter product Details");
			     System.out.println("Enter Product code0");
			     prodCode=scanner.nextInt();
			     System.out.println("Enter the quantity");
			     quantity=scanner.nextInt();
			     System.out.println("Enter product Category");
			     category=scanner.next();
			     System.out.println("Enter the product description");
			     ProDescription=scanner.next();
			     System.out.println("Enter the product price");
			     price=scanner.nextDouble();;
			     System.out.println("enter the product quantity");
			     quantity=scanner.nextInt();
			     
			     lineTotal=(quantity*price);
			     System.out.println("the line price is"+lineTotal);
			
	}

}
