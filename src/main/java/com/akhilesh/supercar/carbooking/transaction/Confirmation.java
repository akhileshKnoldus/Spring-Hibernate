package com.akhilesh.supercar.carbooking.transaction;

import com.akhilesh.supercar.carbooking.entity.PayementModule.Payement;

public class Confirmation {
	private String confirmationId;
	private BookingRecord bookingRecord;
	private Payement payement;
	private byte confirmationFlag;
	
	
	public Confirmation() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param confirmationId
	 * @param bookingRecord
	 * @param payement
	 * @param confirmationFlag
	 */
	public Confirmation(String confirmationId, BookingRecord bookingRecord, Payement payement, byte confirmationFlag) {
		super();
		this.confirmationId = confirmationId;
		this.bookingRecord = bookingRecord;
		this.payement = payement;
		this.confirmationFlag = confirmationFlag;
	}


	public String getConfirmationId() {
		return confirmationId;
	}


	public void setConfirmationId(String confirmationId) {
		this.confirmationId = confirmationId;
	}


	public BookingRecord getBookingRecord() {
		return bookingRecord;
	}


	public void setBookingRecord(BookingRecord bookingRecord) {
		this.bookingRecord = bookingRecord;
	}


	public Payement getPayement() {
		return payement;
	}


	public void setPayement(Payement payement) {
		this.payement = payement;
	}


	public byte getConfirmationFlag() {
		return confirmationFlag;
	}


	public void setConfirmationFlag(byte confirmationFlag) {
		this.confirmationFlag = confirmationFlag;
	}


	@Override
	public String toString() {
		return "Confirmation [confirmationId=" + confirmationId + ", bookingRecord=" + bookingRecord + ", payement="
				+ payement + ", confirmationFlag=" + confirmationFlag + "]";
	}
	
	

}
