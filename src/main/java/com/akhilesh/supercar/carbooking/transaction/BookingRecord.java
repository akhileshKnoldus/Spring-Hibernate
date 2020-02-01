package com.akhilesh.supercar.carbooking.transaction;

import java.util.Date;

import com.akhilesh.supercar.carbooking.entity.Users;
import com.akhilesh.supercar.entity.LocationType.Location;
import com.akhilesh.supercar.entity.vehicle.Car;

public class BookingRecord {
	
	private String bookingid;
	private Location sourceLocation;
	private Location destinationLocation;
	private Users user;
	private Car car;
	private TimeSheet timeSheet;
	private Date dateOfJourney;
	private int distance;
	private int numberOfPassanger;
	private byte driverFalg;
	private byte confirmFlag;
	
	
	public BookingRecord() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param bookingid
	 * @param sourceLocation
	 * @param destinationLocation
	 * @param user
	 * @param car
	 * @param timeSheet
	 * @param dateOfJourney
	 * @param distance
	 * @param numberOfPassanger
	 * @param driverFalg
	 * @param confirmFlag
	 */
	public BookingRecord(String bookingid, Location sourceLocation, Location destinationLocation, Users user, Car car,
			TimeSheet timeSheet, Date dateOfJourney, int distance, int numberOfPassanger, byte driverFalg,
			byte confirmFlag) {
		super();
		this.bookingid = bookingid;
		this.sourceLocation = sourceLocation;
		this.destinationLocation = destinationLocation;
		this.user = user;
		this.car = car;
		this.timeSheet = timeSheet;
		this.dateOfJourney = dateOfJourney;
		this.distance = distance;
		this.numberOfPassanger = numberOfPassanger;
		this.driverFalg = driverFalg;
		this.confirmFlag = confirmFlag;
	}



	public String getBookingid() {
		return bookingid;
	}
	public void setBookingid(String bookingid) {
		this.bookingid = bookingid;
	}
	public Location getSourceLocation() {
		return sourceLocation;
	}
	public void setSourceLocation(Location sourceLocation) {
		this.sourceLocation = sourceLocation;
	}
	public Location getDestinationLocation() {
		return destinationLocation;
	}
	public void setDestinationLocation(Location destinationLocation) {
		this.destinationLocation = destinationLocation;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public TimeSheet getTimeSheet() {
		return timeSheet;
	}
	public void setTimeSheet(TimeSheet timeSheet) {
		this.timeSheet = timeSheet;
	}
	public Date getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(Date dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getNumberOfPassanger() {
		return numberOfPassanger;
	}
	public void setNumberOfPassanger(int numberOfPassanger) {
		this.numberOfPassanger = numberOfPassanger;
	}
	public byte getDriverFalg() {
		return driverFalg;
	}
	public void setDriverFalg(byte driverFalg) {
		this.driverFalg = driverFalg;
	}
	public byte getConfirmFlag() {
		return confirmFlag;
	}
	public void setConfirmFlag(byte confirmFlag) {
		this.confirmFlag = confirmFlag;
	}
	@Override
	public String toString() {
		return "BookingRecord [bookingid=" + bookingid + ", sourceLocation=" + sourceLocation + ", destinationLocation="
				+ destinationLocation + ", user=" + user + ", car=" + car + ", timeSheet=" + timeSheet
				+ ", dateOfJourney=" + dateOfJourney + ", distance=" + distance + ", numberOfPassanger="
				+ numberOfPassanger + ", driverFalg=" + driverFalg + ", confirmFlag=" + confirmFlag + "]";
	}
	
	

}
