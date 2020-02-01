package com.akhilesh.supercar.carbooking.entity.PayementModule;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "InsuranceType")
public class InsuranceType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "insuranceTypeId")
	private String insuranceTypeId;
	
	@Column(name = "description")
	private String description;
	
	public InsuranceType() {
		// TODO Auto-generated constructor stub
	}
}
