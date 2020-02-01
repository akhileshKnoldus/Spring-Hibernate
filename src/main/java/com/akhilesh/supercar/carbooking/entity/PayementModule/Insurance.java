package com.akhilesh.supercar.carbooking.entity.PayementModule;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.akhilesh.supercar.entity.vehicle.Car;

@Entity
@Table(name = "Insurance")
public class Insurance {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "insuranceId")
	private String insuranceId;
	
	@Column(name ="companyName" )
	private String companyName;
	
	@Column(name = "dateOfInsurance")
	private Date dateOfInsurance;
	
	
	@Column(name = "insuranceAmount")
	private double insuranceAmount;
	
	@Column(name = "renewDate")
	private Date renewDate;
	
	private InsuranceType nsuranceType;
	
	private Car car;
	
	public Insurance() {

	}

	

	/**
	 * @param insuranceId
	 * @param companyName
	 * @param dateOfInsurance
	 * @param insuranceAmount
	 * @param renewDate
	 * @param nsuranceType
	 * @param car
	 */
	public Insurance(String insuranceId, String companyName, Date dateOfInsurance, double insuranceAmount,
			Date renewDate, InsuranceType nsuranceType, Car car) {
		super();
		this.insuranceId = insuranceId;
		this.companyName = companyName;
		this.dateOfInsurance = dateOfInsurance;
		this.insuranceAmount = insuranceAmount;
		this.renewDate = renewDate;
		this.nsuranceType = nsuranceType;
		this.car = car;
	}



	public double getInsuranceAmount() {
		return insuranceAmount;
	}



	public void setInsuranceAmount(double insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}



	public Date getRenewDate() {
		return renewDate;
	}



	public void setRenewDate(Date renewDate) {
		this.renewDate = renewDate;
	}



	public InsuranceType getNsuranceType() {
		return nsuranceType;
	}



	public void setNsuranceType(InsuranceType nsuranceType) {
		this.nsuranceType = nsuranceType;
	}



	public String getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(String insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getDateOfInsurance() {
		return dateOfInsurance;
	}

	public void setDateOfInsurance(Date dateOfInsurance) {
		this.dateOfInsurance = dateOfInsurance;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}



	@Override
	public String toString() {
		return "Insurance [insuranceId=" + insuranceId + ", companyName=" + companyName + ", dateOfInsurance="
				+ dateOfInsurance + ", insuranceAmount=" + insuranceAmount + ", renewDate=" + renewDate
				+ ", nsuranceType=" + nsuranceType + ", car=" + car + "]";
	}
	
	
	
	
	
	
}
