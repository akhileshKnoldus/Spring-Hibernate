package com.akhilesh.supercar.carbooking.transaction;

import java.util.Date;

import com.akhilesh.supercar.entity.vehicle.Car;

public class CarForSaleRecord {
	private String saleId;
	private Date dateOfAdded;
	private double salePrice;
	private int speedoReading;
	private Car car;

	public CarForSaleRecord() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param saleId
	 * @param dateOfAdded
	 * @param salePrice
	 * @param speedoReading
	 * @param car
	 */
	public CarForSaleRecord(String saleId, Date dateOfAdded, double salePrice, int speedoReading, Car car) {
		super();
		this.saleId = saleId;
		this.dateOfAdded = dateOfAdded;
		this.salePrice = salePrice;
		this.speedoReading = speedoReading;
		this.car = car;
	}

	public String getSaleId() {
		return saleId;
	}

	public void setSaleId(String saleId) {
		this.saleId = saleId;
	}

	public Date getDateOfAdded() {
		return dateOfAdded;
	}

	public void setDateOfAdded(Date dateOfAdded) {
		this.dateOfAdded = dateOfAdded;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public int getSpeedoReading() {
		return speedoReading;
	}

	public void setSpeedoReading(int speedoReading) {
		this.speedoReading = speedoReading;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "CarForSaleRecord [saleId=" + saleId + ", dateOfAdded=" + dateOfAdded + ", salePrice=" + salePrice
				+ ", speedoReading=" + speedoReading + ", car=" + car + "]";
	}
	
	

}
