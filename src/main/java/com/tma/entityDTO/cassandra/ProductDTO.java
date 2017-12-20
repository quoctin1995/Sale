package com.tma.entityDTO.cassandra;

import java.util.UUID;

import com.tma.entity.cassandra.Product;

public class ProductDTO {
	private UUID productId;
	private Integer item;
	private String class_pr;
	private String inventory;

	public ProductDTO(Product product) {
		this.productId = product.getProductId();
		this.item = product.getItem();
		this.class_pr = product.getClass_pr();
		this.inventory = product.getInventory();
	}

	public UUID getProductId() {
		return productId;
	}

//	public void setProductId(UUID productId) {
//		this.productId = productId;
//	}

	public Integer getItem() {
		return item;
	}

//	public void setItem(Integer item) {
//		this.item = item;
//	}

	public String getClass_pr() {
		return class_pr;
	}

//	public void setClass_pr(String class_pr) {
//		this.class_pr = class_pr;
//	}

	public String getInventory() {
		return inventory;
	}

//	public void setInventory(String inventory) {
//		this.inventory = inventory;
//	}

}
