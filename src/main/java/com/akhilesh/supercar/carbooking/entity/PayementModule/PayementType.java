package com.akhilesh.supercar.carbooking.entity.PayementModule;

public class PayementType {
	private String payementId;
	private String payementDescription;
	
	public PayementType() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param payementId
	 * @param payementDescription
	 */
	public PayementType(String payementId, String payementDescription) {
		super();
		this.payementId = payementId;
		this.payementDescription = payementDescription;
	}

	public String getPayementId() {
		return payementId;
	}

	public void setPayementId(String payementId) {
		this.payementId = payementId;
	}

	public String getPayementDescription() {
		return payementDescription;
	}

	public void setPayementDescription(String payementDescription) {
		this.payementDescription = payementDescription;
	}

	@Override
	public String toString() {
		return "PayementType [payementId=" + payementId + ", payementDescription=" + payementDescription + "]";
	}
	
	

}
