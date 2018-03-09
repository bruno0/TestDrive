package com.mercedes.tesDrive.dto;

import java.util.Date;

public class Booking {
	
	private String id;	
	private String vehicleId;
	private String firstName;
	private String lastName;
	private String pickupDate;
	private String createdAt;
	
	private String cancelledAt;
	private String cancelledReason;
	
	
	public Booking (String _id,String _vehicleId, String _firstName, String _lastName, String _pickupDate, String _createdAt, String _cancelledAt,String _cancelledReason) {
		setId(_id);
		setVehicleId(_vehicleId);
		setFirstName(_firstName);
		setLastName(_lastName);
		setPickupDate(_pickupDate);
		 setCreatedAt(_createdAt);
		 setCancelledAt(_cancelledAt);
		 setCancelledReason(_cancelledReason);
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPickupDate() {
		return pickupDate;
	}
	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getCancelledAt() {
		return cancelledAt;
	}
	public void setCancelledAt(String cancelledAt) {
		this.cancelledAt = cancelledAt;
	}
	public String getCancelledReason() {
		return cancelledReason;
	}
	public void setCancelledReason(String cancelledReason) {
		this.cancelledReason = cancelledReason;
	}
		
}
