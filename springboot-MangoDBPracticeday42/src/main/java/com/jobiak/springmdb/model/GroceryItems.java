package com.jobiak.springmdb.model;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="mygrocerylist")
public class GroceryItems {
	
	
	private Long productId;
	private String name;
	private double quantity;
	private String category;
	
	public GroceryItems() {
		
	}
	

	public GroceryItems(Long productId, String name, double quantity, String category) {
		this.productId = productId;
		this.name = name;
		this.quantity = quantity;
		this.category = category;
	}


	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "GroceryItems [productId=" + productId + ", name=" + name + ", quantity=" + quantity + ", category="
				+ category + "]";
	}

	
}
