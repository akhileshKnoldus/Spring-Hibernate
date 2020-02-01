package com.akhilesh.supercar.carbooking.entity.PayementModule;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Payement")
public class Payement {
	
	private String payementId;
	
	private double amount;
	private Date transactionTime;
	private PayementType payementType;
	
	public Payement() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param payementId
	 * @param amount
	 * @param transactionTime
	 * @param payementType
	 */
	public Payement(String payementId, double amount, Date transactionTime, PayementType payementType) {
		super();
		this.payementId = payementId;
		this.amount = amount;
		this.transactionTime = transactionTime;
		this.payementType = payementType;
	}

	public String getPayementId() {
		return payementId;
	}

	public void setPayementId(String payementId) {
		this.payementId = payementId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(Date transactionTime) {
		this.transactionTime = transactionTime;
	}

	public PayementType getPayementType() {
		return payementType;
	}

	public void setPayementType(PayementType payementType) {
		this.payementType = payementType;
	}

	@Override
	public String toString() {
		return "Payement [payementId=" + payementId + ", amount=" + amount + ", transactionTime=" + transactionTime
				+ ", payementType=" + payementType + "]";
	}
	
	
	

}
