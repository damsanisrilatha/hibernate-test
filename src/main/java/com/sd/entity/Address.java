package com.sd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employe_address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "Id")
	private Integer id;
	
	@Column(name="first_address")
	 private String firstAddress; 
	
	@Column(name="second_address")
	private String secondAddress;
	
	@Column(name="city")
	private String city;
	
	@Column(name="country")
	private String country;
	
	@Column(name="pincode")
	private Integer pincode;
	@ManyToOne
	@JoinColumn(name="employee_id",referencedColumnName="E_Id")
	private Employe employes;
	
	public Employe getEmployes() {
		return employes;
	}
	public void setEmployes(Employe employes) {
		this.employes = employes;
	}
	public Address()
	{
		
	}
	public Address(Integer id, String firstAddress, String secondAddress,
			String city, String country, Integer pincode) {
		super();
		this.id = id;
		this.firstAddress = firstAddress;
		this.secondAddress = secondAddress;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstAddress() {
		return firstAddress;
	}
	public void setFirstAddress(String firstAddress) {
		this.firstAddress = firstAddress;
	}
	public String getSecondAddress() {
		return secondAddress;
	}
	public void setSecondAddress(String secondAddress) {
		this.secondAddress = secondAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", firstAddress=" + firstAddress
				+ ", secondAddress=" + secondAddress + ", city=" + city
				+ ", country=" + country + ", pincode=" + pincode + "]";
	}
	
	
}
