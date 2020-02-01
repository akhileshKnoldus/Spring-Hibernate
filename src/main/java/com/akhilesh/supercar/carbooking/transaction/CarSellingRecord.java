package com.akhilesh.supercar.carbooking.transaction;

import java.util.Date;

import com.akhilesh.supercar.carbooking.entity.Users;
import com.akhilesh.supercar.carbooking.entity.PayementModule.Payement;

public class CarSellingRecord {
	
	private String carSellerId;
	private Users user;
	private Payement payement;
	private Date dateOfSale;
	private CarForSaleRecord carForSaleRecord;
	
	public CarSellingRecord() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param carSellerId
	 * @param user
	 * @param payement
	 * @param dateOfSale
	 * @param carForSaleRecord
	 */
	public CarSellingRecord(String carSellerId, Users user, Payement payement, Date dateOfSale,
			CarForSaleRecord carForSaleRecord) {
		super();
		this.carSellerId = carSellerId;
		this.user = user;
		this.payement = payement;
		this.dateOfSale = dateOfSale;
		this.carForSaleRecord = carForSaleRecord;
	}



	public String getCarSellerId() {
		return carSellerId;
	}
	public void setCarSellerId(String carSellerId) {
		this.carSellerId = carSellerId;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Payement getPayement() {
		return payement;
	}
	public void setPayement(Payement payement) {
		this.payement = payement;
	}
	public Date getDateOfSale() {
		return dateOfSale;
	}
	public void setDateOfSale(Date dateOfSale) {
		this.dateOfSale = dateOfSale;
	}
	public CarForSaleRecord getCarForSaleRecord() {
		return carForSaleRecord;
	}
	public void setCarForSaleRecord(CarForSaleRecord carForSaleRecord) {
		this.carForSaleRecord = carForSaleRecord;
	}
	@Override
	public String toString() {
		return "CarSellingRecord [carSellerId=" + carSellerId + ", user=" + user + ", payement=" + payement
				+ ", dateOfSale=" + dateOfSale + ", carForSaleRecord=" + carForSaleRecord + "]";
	}

}
