package com.sd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name = "TRANSACTIONS")
public class TransactionList {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "id")
	private Integer id;
	
	
	@Column(name = "FROM_ACCOUNT")
	private String from;
	
	@Column(name="TO_ACCOUNT")
	private String to;
	
	@Column(name="TRANSACTION_TYPE")
	private String type;
	
	@Column(name="amount")
	private Double amount;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
	@Fetch(FetchMode.JOIN)
	private Customer customer;
	
	public TransactionList(){}
	

	public TransactionList(String from, String to, String type, Double amount) {
		super();
		this.from = from;
		this.to = to;
		this.type = type;
		this.amount = amount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "TransactionList [id=" + id + ", from=" + from + ", to=" + to
				+ ", type=" + type + ", amount=" + amount + ", customer="
				+ customer + "]";
	}
	
	
	
	
}
