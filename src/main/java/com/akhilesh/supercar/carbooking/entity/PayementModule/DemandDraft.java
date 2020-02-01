package com.akhilesh.supercar.carbooking.entity.PayementModule;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "DemandDraft")
public class DemandDraft {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ddId")
	private String ddNumber;
	
	@Column(name = "bankName")
	private String bankName;
	
	@Column(name = "branchName")
	private String branchName;
	
	@Column(name = "amount")
	private double amount;
	
	@Column(name = "depositeDate")
	private Date depositeDate;
	
	@Column(name = "expDate")
	private Date expiraryDate;
	
	
	private Payement payement;

	public DemandDraft() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param ddNumber
	 * @param bankName
	 * @param branchName
	 * @param amount
	 * @param depositeDate
	 * @param expiraryDate
	 * @param payement
	 */
	public DemandDraft(String ddNumber, String bankName, String branchName, double amount, Date depositeDate,
			Date expiraryDate, Payement payement) {
		super();
		this.ddNumber = ddNumber;
		this.bankName = bankName;
		this.branchName = branchName;
		this.amount = amount;
		this.depositeDate = depositeDate;
		this.expiraryDate = expiraryDate;
		this.payement = payement;
	}

	public String getDdNumber() {
		return ddNumber;
	}

	public void setDdNumber(String ddNumber) {
		this.ddNumber = ddNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDepositeDate() {
		return depositeDate;
	}

	public void setDepositeDate(Date depositeDate) {
		this.depositeDate = depositeDate;
	}

	public Date getExpiraryDate() {
		return expiraryDate;
	}

	public void setExpiraryDate(Date expiraryDate) {
		this.expiraryDate = expiraryDate;
	}

	public Payement getPayement() {
		return payement;
	}

	public void setPayement(Payement payement) {
		this.payement = payement;
	}

	@Override
	public String toString() {
		return "DemandDraft [ddNumber=" + ddNumber + ", bankName=" + bankName + ", branchName=" + branchName
				+ ", amount=" + amount + ", depositeDate=" + depositeDate + ", expiraryDate=" + expiraryDate
				+ ", payement=" + payement + "]";
	}

}
