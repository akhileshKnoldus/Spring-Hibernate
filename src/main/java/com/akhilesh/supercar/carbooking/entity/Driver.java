package com.akhilesh.supercar.carbooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Driver")
public class Driver {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "driverid")
	private String driverId;
	
	@Column(name = "licenceid")
	private String liceceId;
	
	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public String getLiceceId() {
		return liceceId;
	}

	public void setLiceceId(String liceceId) {
		this.liceceId = liceceId;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", liceceId=" + liceceId + "]";
	}
	
	

}
