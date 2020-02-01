package com.akhilesh.supercar.carbooking.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.akhilesh.supercar.entity.LocationType.Branch;

@Entity
@Table(name = "Employee")
public class Employee extends Users {

	@Column(name = "doj")
	private Date dateOfJoing;

	@Column(name = "role")
	private String role;
	
	
	private Branch branch;

	public Date getDateOfJoing() {
		return dateOfJoing;
	}

	public void setDateOfJoing(Date dateOfJoing) {
		this.dateOfJoing = dateOfJoing;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Employee [dateOfJoing=" + dateOfJoing + ", role=" + role + ", branch=" + branch + "]";
	}

}
