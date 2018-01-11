package com.tma.entityDTO;

import java.util.UUID;

import com.tma.entity.Product;

public class ProductDTO {
	private UUID productId;
	private Integer item;
	private String class_pr;
	private String inventory;

	public ProductDTO(Product product) {
		this.productId = product.getProductId();
		this.item = product.getItem();
		this.class_pr = product.getclass_pr();
		this.inventory = product.getInventory();
	}

	public UUID getProductId() {
		return productId;
	}

	public Integer getItem() {
		return item;
	}

	public String getclass_pr() {
		return class_pr;
	}

	public String getInventory() {
		return inventory;
	}

}
