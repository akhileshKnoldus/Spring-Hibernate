package com.akhilesh.supercar.entity.vehicle;

import java.util.Date;

public class Coupon {

	private String couponId;
	private double minAmount;
	private double maxAmount;
	private Date expDate;
	private double discount;
	
	public Coupon() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param couponId
	 * @param minAmount
	 * @param maxAmount
	 * @param expDate
	 * @param discount
	 */
	public Coupon(String couponId, double minAmount, double maxAmount, Date expDate, double discount) {
		super();
		this.couponId = couponId;
		this.minAmount = minAmount;
		this.maxAmount = maxAmount;
		this.expDate = expDate;
		this.discount = discount;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public double getMinAmount() {
		return minAmount;
	}

	public void setMinAmount(double minAmount) {
		this.minAmount = minAmount;
	}

	public double getMaxAmount() {
		return maxAmount;
	}

	public void setMaxAmount(double maxAmount) {
		this.maxAmount = maxAmount;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Coupon [couponId=" + couponId + ", minAmount=" + minAmount + ", maxAmount=" + maxAmount + ", expDate="
				+ expDate + ", discount=" + discount + "]";
	}
	
	
}
