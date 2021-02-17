package com.sd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "E_Id")
	private Integer id;
	@Column(name="first_name")
	private String FirstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone_no")
	private Integer phoneno;
	
	@OneToOne(mappedBy="emp")
	private Salary sal;
	
	@OneToOne(mappedBy="employes")
	private Address address;
	@ManyToOne
	@JoinColumn(name="dept_no",referencedColumnName="id")
	private Department dept;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Salary getSal() {
		return sal;
	}
	public void setSal(Salary sal) {
		this.sal = sal;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Employe()
	{
		
	}
	public Employe(String firstName, String lastName, String email,
			Integer phoneno) {
		super();
		FirstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneno = phoneno;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Integer phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", FirstName=" + FirstName + ", lastName="
				+ lastName + ", email=" + email + ", phoneno=" + phoneno + "]";
	}
	
	}


