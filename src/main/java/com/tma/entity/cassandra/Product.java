package com.tma.entity.cassandra;
import java.util.UUID;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("product")
public class Product {

	@PrimaryKey("product_id")
	private UUID productId;
	@Column("item")
	private Integer item;
	@Column("class_pr")
	private String class_pr;
	@Column("inventory")
	private String inventory;

	public Product(UUID productId, Integer item, String class_pr, String inventory) {
		this.productId = productId;
		this.item = item;
		this.class_pr = class_pr;
		this.inventory = inventory;
	}
	public Product() {
		
	}

	public UUID getProductId() {
		return productId;
	}

	public void setProductId(UUID productId) {
		this.productId = productId;
	}

	public Integer getItem() {
		return item;
	}

	public void setItem(Integer item) {
		this.item = item;
	}

	public String getClass_pr() {
		return class_pr;
	}

	public void setClass_pr(String class_pr) {
		this.class_pr = class_pr;
	}

	public String getInventory() {
		return inventory;
	}

	public void setInventory(String inventory) {
		this.inventory = inventory;
	}

}
