package com.tma.entity;

import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product", schema = "public")
public class Product {

	private UUID productId;
	private Integer item;
	private String class_pr;
	private String inventory;
	private Set<Sale> sale;

	public Product() {
	}

	public Product(UUID productId) {
		this.productId = productId;
	}

	public Product(UUID productId, Integer item, String class_pr, String inventory, Set<Sale> sale) {
		this.productId = productId;
		this.item = item;
		this.class_pr = class_pr;
		this.inventory = inventory;
		this.sale = sale;
	}

	@Id
	@Column(name = "product_id", unique = true, nullable = false)
	public UUID getProductId() {
		return this.productId;
	}

	public void setProductId(UUID productId) {
		this.productId = productId;
	}

	@Column(name = "item")
	public Integer getItem() {
		return this.item;
	}

	public void setItem(Integer item) {
		this.item = item;
	}

	@Column(name = "class", length = 1)
	public String getclass_pr() {
		return this.class_pr;
	}

	public void setclass_pr(String class_pr) {
		this.class_pr = class_pr;
	}

	@Column(name = "inventory", length = 1)
	public String getInventory() {
		return this.inventory;
	}

	public void setInventory(String inventory) {
		this.inventory = inventory;
	}

	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
	public Set<Sale> getsale() {
		return this.sale;
	}

	public void setsale(Set<Sale> sale) {
		this.sale = sale;
	}

}
