package problem1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Product {

	
	int productId;
	String productName;
	double productPrice;
	
	
	
	Product(){
		
	}



	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}



	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public double getProductPrice() {
		return productPrice;
	}



	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	
	
	
	
	
   
	
	
}
