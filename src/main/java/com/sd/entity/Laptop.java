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
@Table(name = "laptops")
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "laptop_id")
	private String laptopid;

	@Column(name = "laptop_name")
	private String laptopname;
	
	@ManyToOne
	@JoinColumn(name="student_id", referencedColumnName="id")
	private Student student;

	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Laptop() {

	}

	public Laptop(Integer id, String laptopid, String laptopname) {
		super();
		this.id = id;
		this.laptopid = laptopid;
		this.laptopname = laptopname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLaptopid() {
		return laptopid;
	}

	public void setLaptopid(String laptopid) {
		this.laptopid = laptopid;
	}

	public String getLaptopname() {
		return laptopname;
	}

	public void setLaptopname(String laptopname) {
		this.laptopname = laptopname;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", laptopid=" + laptopid + ", laptopname="
				+ laptopname + "]";
	}

}
