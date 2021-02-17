package com.sd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="customer_name")
	private String customername;
	
	@Column(name="item_name")
	private String itemname;
	
	@Column(name="item_price")
	private Double price;
	
public 	Order()
	{
		
	}

	public Order(Integer id, String customername, String itemname, Double price) {
		super();
		this.id = id;
		this.customername = customername;
		this.itemname = itemname;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customername=" + customername
				+ ", itemname=" + itemname + ", price=" + price + "]";
	}
	
}
