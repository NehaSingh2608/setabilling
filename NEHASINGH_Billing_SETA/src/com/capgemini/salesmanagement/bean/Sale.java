package com.capgemini.salesmanagement.bean;
import java.time.LocalDate;

//It is bean class that take the attributes and generate getter and setter for them



import java.util.Map;

public class Sale  {
	private int saleId;
	private int prodCode;
	private String productName;
	private String category;
	private LocalDate saleDate;
	private int quantity;
	private float lineToatal;
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public int getProdCode() {
		return prodCode;
	}
	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public LocalDate getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getLineToatal() {
		return lineToatal;
	}
	public void setLineToatal(float lineToatal) {
		this.lineToatal = lineToatal;
	}
	
	public Sale() {
		super();
	}
	
	public Sale(int saleId, int prodCode, String productName, String category, LocalDate saleDate, int quantity,
			float lineToatal) {
		super();
		this.saleId = saleId;
		this.prodCode = prodCode;
		this.productName = productName;
		this.category = category;
		this.saleDate = saleDate;
		this.quantity = quantity;
		this.lineToatal = lineToatal;
	}
	
	@Override
	public String toString() {
		return "Sale [saleId=" + saleId + ", prodCode=" + prodCode + ", productName=" + productName + ", category="
				+ category + ", saleDate=" + saleDate + ", quantity=" + quantity + ", lineToatal=" + lineToatal + "]";
	} 
	
	}
	
