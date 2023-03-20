package com.example.SpringStoreApplication.dataentity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "sales")
public class Sales {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String customerName;

	private double totalAmount;

	@OneToMany(mappedBy = "sale", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Products> products;

	public Sales(int id, String customerName, double totalAmount, Set<Products> products) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.totalAmount = totalAmount;
		this.products = products;
	}

	public Sales() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Set<Products> getProducts() {
		return products;
	}

	public void setProducts(Set<Products> products) {
		this.products = products;
	}

}