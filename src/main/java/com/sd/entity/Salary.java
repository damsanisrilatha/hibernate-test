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
@Table(name="employe_salary")
public class Salary {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "id")
	private Integer id;
	@Column(name="accountNo")
	private Integer accountNo;
	
	@Column(name="salary")
	private Double salary;
	@OneToOne
	@JoinColumn(name="emp_id",referencedColumnName="E_Id")
	private Employe emp;
	
	
 public Employe getEmp() {
		return emp;
	}

	public void setEmp(Employe emp) {
		this.emp = emp;
	}

public Salary()
{
	
}

public Salary(Integer accountNo, Double salary) {
	super();
	this.accountNo = accountNo;
	this.salary = salary;
}

public Integer getAccountNo() {
	return accountNo;
}

public void setAccountNo(Integer accountNo) {
	this.accountNo = accountNo;
}

public Double getSalary() {
	return salary;
}

public void setSalary(Double salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Salary [id=" + id + ", accountNo=" + accountNo + ", salary="
			+ salary + "]";
}


}
