package com.mercedes.tesDrive.dto;


public class Vehicle {
	
	
	private String id;
	private String model;
	private String fuel;
	private String transmission;
	
	private Availability availability;
	
	
	public Vehicle(String id, String model, String fuel, String transmission) {
		setId(id);
		setModel(model);
		setFuel(fuel);
		setTransmission(transmission);
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehicle [id=").append(id).append(", model=").append(model).append(", fuel=").append(fuel)
				.append(", transmission=").append(transmission).append(", availability=").append(availability)
				.append("]");
		return builder.toString();
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public Availability getAvailability() {
		return availability;
	}

	public void setAvailability(Availability availability) {
		this.availability = availability;
	}

	
		
}
