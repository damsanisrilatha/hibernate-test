package com.sd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer_login")
public class CustomerLogin {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="user_name")
	private String username;
	@Column(name="password")
	private String password;
	@OneToOne
	@JoinColumn(name="customer_id" ,referencedColumnName="ID")
	private Customer customers;
	
public Customer getCustomers() {
		return customers;
	}

	public void setCustomers(Customer customers) {
		this.customers = customers;
	}

public CustomerLogin()
{
	
}

public CustomerLogin(String username, String password) {
	super();
	
	this.username = username;
	this.password = password;
}

@Override
public String toString() {
	return "CustomerLogin [username=" + username + ", password=" + password+ "customers="+customers+"]";
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
	}


